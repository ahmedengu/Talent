package models;

import models.talentDB.Tables;
import models.talentDB.tables.pojos.*;
import models.talentDB.tables.records.*;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.mindrot.jbcrypt.BCrypt;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Http;

import javax.inject.Inject;
import java.io.File;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;

import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.sum;
import static play.mvc.Controller.request;
import static play.mvc.Controller.session;

public class RESTHelper {
    @Inject
    FormFactory formFactory;

    public static Table getTableByName(String table) {
        switch (table.toUpperCase()) {
            case "USER":
                return Tables.USER;
            case "POST":
                return Tables.POST;
            case "CATEGORY":
                return Tables.CATEGORY;
            case "FOLLOWER":
                return Tables.FOLLOWER;
            case "LIKE":
                return Tables.LIKE;
            case "COMMENT":
                return Tables.COMMENT;
            case "TAG":
                return Tables.TAG;
            case "RATE":
                return Tables.RATE;
            case "POST_TAG":
                return Tables.POST_TAG;
        }
        return null;
    }

    public static Class getClassByName(String table) {
        switch (table.toUpperCase()) {
            case "USER":
                return User.class;
            case "POST":
                return Post.class;
            case "CATEGORY":
                return Category.class;
            case "FOLLOWER":
                return Follower.class;
            case "LIKE":
                return Like.class;
            case "COMMENT":
                return Comment.class;
            case "TAG":
                return Tag.class;
            case "RATE":
                return Rate.class;
            case "POST_TAG":
                return PostTag.class;
        }
        return null;
    }

    public static Field[] getSelectFieldsByName(String table) {
        switch (table.toUpperCase()) {
            case "USER":
                return Tables.USER.fields();
            case "USERGETALL":
                return new Field[]{Tables.USER.USER_ID, Tables.USER.NICKNAME, Tables.USER.USERNAME};
            case "POST":
                return Tables.POST.fields();
            case "CATEGORY":
                return Tables.CATEGORY.fields();
            case "FOLLOWER":
                return Tables.FOLLOWER.fields();
            case "LIKE":
                return Tables.LIKE.fields();
            case "COMMENT":
                return Tables.COMMENT.fields();
            case "TAG":
                return Tables.TAG.fields();
            case "RATE":
                return Tables.RATE.fields();
            case "POST_TAG":
                return Tables.POST_TAG.fields();
        }
        return null;
    }

    public static UpdatableRecord getRecordByName(String table) {
        switch (table.toUpperCase()) {
            case "USER":
                return new UserRecord();
            case "POST":
                return new PostRecord();
            case "CATEGORY":
                return new CategoryRecord();
            case "FOLLOWER":
                return new FollowerRecord();
            case "LIKE":
                return new LikeRecord();
            case "COMMENT":
                return new CommentRecord();
            case "TAG":
                return new TagRecord();
            case "RATE":
                return new RateRecord();
            case "POST_TAG":
                return new PostTagRecord();
        }
        return null;
    }

    public User login(String email, String password) throws SQLException {
        User user = null;
        try {
            user = getDslContext().selectFrom(Tables.USER).where(Tables.USER.EMAIL.equal(email)).fetchOne().into(User.class);
            if (!BCrypt.checkpw(password, user.getPassword())) {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
        if (user == null) return null;

        return user;

    }

    public List getAll(String tableName, String page) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        if (tableName.toLowerCase().equals("user"))
            tableName = "usergetall";
        Field[] selectFields = getSelectFieldsByName(tableName);
        if (page != null)
            return getAll(table, selectFields, tableClass, page);
        else
            return getAll(table, selectFields, tableClass);
    }

    public List getAll(Table table, Field[] selectFields, Class tableClass) throws SQLException {
        return getDslContext().select(selectFields).from(table).fetch().into(tableClass);
    }

    public List getAll(Table table, Field[] selectFields, Class tableClass, String page) throws SQLException {
//        List list = getDslContext().select(selectFields).from(table).fetch().into(tableClass);
//        if ((Integer.parseInt(page) + 1) * 10 < list.size())
//            return list.subList(Integer.parseInt(page) * 10, (Integer.parseInt(page) + 1) * 10);
//        else
//            return list.subList(Integer.parseInt(page) * 10, list.size());
        if (page == null)
            return getDslContext().select(selectFields).from(table).fetch().into(tableClass);
        else {
            int i = Integer.parseInt(page) == 0 ? 0 : Integer.parseInt(page) * 10;
            return getDslContext().select(selectFields).from(table).orderBy(selectFields[0]).seek(i).limit(10).fetch().into(tableClass);
        }
    }

    public List getByID(String tableName, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return getByID(table, selectFields, tableClass, record, id);
    }

    public List getByID(Table table, Field[] selectFields, Class tableClass, UpdatableRecord record, String id) throws SQLException {
        Field field = getIDField(table);
        return getDslContext().select(selectFields).from(table).where(field.equal(id)).fetch().into(tableClass);
    }

    private Field getIDField(Table table) {
        TableField[] fieldsArray = table.getPrimaryKey().getFieldsArray();
        Field field = null;
        for (int i = 0; i < fieldsArray.length; i++) {
            if (fieldsArray[i].getName().contains("ID")) {
                field = fieldsArray[i];
                break;
            }
        }
        return field;
    }

    public List getWhere(String tableName, String where, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return getWhere(table, selectFields, tableClass, record, where, id);
    }

    public List getWhere(Table table, Field[] selectFields, Class tableClass, UpdatableRecord record, String where, String id) throws SQLException {
        return getDslContext().select(selectFields).from(table).where(table.field(where).equal(id)).fetch().into(tableClass);
    }

    public List deletePostTag(String tableName, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        int deletedRecord = getDslContext().delete(table).where(Tables.POST_TAG.POST_ID.equal(Integer.valueOf(id))).execute();
        List list = new ArrayList<>();


        list.add(deletedRecord);
        return list;

    }

    public List deleteByID(String tableName, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return deleteByID(table, selectFields, tableClass, record, id);
    }

    public List deleteByID(Table table, Field[] selectFields, Class tableClass, UpdatableRecord record, String id) throws SQLException {
        List list = new ArrayList<>();
        Field field = getIDField(table);

        int deletedRecord = getDslContext().delete(table).where(field.equal(id)).execute();


        list.add(deletedRecord);
        return list;
    }

    public List create(String tableName, Object form) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);


        return create(table, selectFields, tableClass, form);
    }

    public List create(Table table, Field[] selectFields, Class tableClass, Object form) throws SQLException {
        UpdatableRecord record = (UpdatableRecord) getDslContext().newRecord(table);

        record.from(((Form) form).get());
//        record.set(table.field("ID"), null);
        if (table.equals(Tables.USER)) {
//            record.set(table.field("studentEmailActivationCode"), UUID.randomUUID().toString().replace("-", "").substring(0, 9));
            String password = BCrypt.hashpw((String) record.get("Password"), BCrypt.gensalt());

            record.set(table.field("Password"), password);

            Http.MultipartFormData<File> body = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart<File> pic = body.getFile("pic");
            if (pic != null && pic.getContentType().contains("image")) {

                String newFile = UUID.randomUUID().toString().replaceAll("-", "") + "." + pic.getContentType().substring(pic.getContentType().indexOf("/") + 1);
                File file = pic.getFile();
                boolean b = file.renameTo(new File(play.Play.application().path().getAbsolutePath() + "/public/localstorage/pics/" + newFile));
                if (b) {
                    record.set(Tables.USER.PROFILE_PICTURE, "/localstorage/pics/" + newFile);

                    File newF = new File(play.Play.application().path().getAbsolutePath() + "/public/localstorage/pics/" + newFile);
                    newF.setReadable(true, false);
//                    newF.setExecutable(true, false);
//                    newF.setWritable(true, false);

                } else return new ArrayList() {{
                    add(new HashMap<String, String>() {{
                        put("file", "not uploaded");
                    }});
                }};
            }

        } else if (table.equals(Tables.POST)) {

            Http.MultipartFormData<File> body = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart<File> video = body.getFile("video");
            if (video != null && video.getContentType().contains("video")) {

                String newFile = UUID.randomUUID().toString().replaceAll("-", "") + "." + video.getContentType().substring(video.getContentType().indexOf("/") + 1);
                File file = video.getFile();
                boolean b = file.renameTo(new File(play.Play.application().path().getAbsolutePath() + "/public/localstorage/videos/" + newFile));
                if (b) {
                    record.set(Tables.POST.POSTURL, "/localstorage/videos/" + newFile);

                    File newF = new File(play.Play.application().path().getAbsolutePath() + "/public/localstorage/videos/" + newFile);
                    newF.setReadable(true, false);
//                    newF.setExecutable(true, false);
//                    newF.setWritable(true, false);
//                    // This OAuth 2.0 access scope allows an application to upload files
//                    // to the authenticated user's YouTube channel, but doesn't allow
//                    // other types of access.
//                    List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube.upload");
//
//                    try {
//                        // Authorize the request.
//                        Credential credential = Auth.authorize(scopes, "uploadvideo");
//
//                        // This object is used to make YouTube Data API requests.
//                        youtube = new YouTube.Builder(Auth.HTTP_TRANSPORT, Auth.JSON_FACTORY, credential).setApplicationName(
//                                "youtube-cmdline-uploadvideo-sample").build();
//
//                        System.out.println("Uploading: " + SAMPLE_VIDEO_FILENAME);
//
//                        // Add extra information to the video before uploading.
//                        Video videoObjectDefiningMetadata = new Video();
//
//                        // Set the video to be publicly visible. This is the default
//                        // setting. Other supporting settings are "unlisted" and "private."
//                        VideoStatus status = new VideoStatus();
//                        status.setPrivacyStatus("public");
//                        videoObjectDefiningMetadata.setStatus(status);
//
//                        // Most of the video's metadata is set on the VideoSnippet object.
//                        VideoSnippet snippet = new VideoSnippet();
//
//                        // This code uses a Calendar instance to create a unique name and
//                        // description for test purposes so that you can easily upload
//                        // multiple files. You should remove this code from your project
//                        // and use your own standard names instead.
//                        Calendar cal = Calendar.getInstance();
//                        snippet.setTitle("Test Upload via Java on " + cal.getTime());
//                        snippet.setDescription(
//                                "Video uploaded via YouTube Data API V3 using the Java library " + "on " + cal.getTime());
//
//                        // Set the keyword tags that you want to associate with the video.
//                        List<String> tags = new ArrayList<String>();
//                        tags.add("test");
//                        tags.add("example");
//                        tags.add("java");
//                        tags.add("YouTube Data API V3");
//                        tags.add("erase me");
//                        snippet.setTags(tags);
//
//                        // Add the completed snippet object to the video resource.
//                        videoObjectDefiningMetadata.setSnippet(snippet);
//
//                        InputStreamContent mediaContent = new InputStreamContent(VIDEO_FILE_FORMAT,
//                                UploadVideo.class.getResourceAsStream("/sample-video.mp4"));
//
//                        // Insert the video. The command sends three arguments. The first
//                        // specifies which information the API request is setting and which
//                        // information the API response should return. The second argument
//                        // is the video resource that contains metadata about the new video.
//                        // The third argument is the actual video content.
//                        YouTube.Videos.Insert videoInsert = youtube.videos()
//                                .insert("snippet,statistics,status", videoObjectDefiningMetadata, mediaContent);
//
//                        // Set the upload type and add an event listener.
//                        MediaHttpUploader uploader = videoInsert.getMediaHttpUploader();
//
//                        // Indicate whether direct media upload is enabled. A value of
//                        // "True" indicates that direct media upload is enabled and that
//                        // the entire media content will be uploaded in a single request.
//                        // A value of "False," which is the default, indicates that the
//                        // request will use the resumable media upload protocol, which
//                        // supports the ability to resume an upload operation after a
//                        // network interruption or other transmission failure, saving
//                        // time and bandwidth in the event of network failures.
//                        uploader.setDirectUploadEnabled(false);
//
//                        MediaHttpUploaderProgressListener progressListener = new MediaHttpUploaderProgressListener() {
//                            public void progressChanged(MediaHttpUploader uploader) throws IOException {
//                                switch (uploader.getUploadState()) {
//                                    case INITIATION_STARTED:
//                                        System.out.println("Initiation Started");
//                                        break;
//                                    case INITIATION_COMPLETE:
//                                        System.out.println("Initiation Completed");
//                                        break;
//                                    case MEDIA_IN_PROGRESS:
//                                        System.out.println("Upload in progress");
//                                        System.out.println("Upload percentage: " + uploader.getProgress());
//                                        break;
//                                    case MEDIA_COMPLETE:
//                                        System.out.println("Upload Completed!");
//                                        break;
//                                    case NOT_STARTED:
//                                        System.out.println("Upload Not Started!");
//                                        break;
//                                }
//                            }
//                        };
//                        uploader.setProgressListener(progressListener);
//
//                        // Call the API and upload the video.
//                        Video returnedVideo = videoInsert.execute();
//
//                        // Print data about the newly inserted video from the API response.
//                        System.out.println("\n================== Returned Video ==================\n");
//                        System.out.println("  - Id: " + returnedVideo.getId());
//                        System.out.println("  - Title: " + returnedVideo.getSnippet().getTitle());
//                        System.out.println("  - Tags: " + returnedVideo.getSnippet().getTags());
//                        System.out.println("  - Privacy Status: " + returnedVideo.getStatus().getPrivacyStatus());
//                        System.out.println("  - Video Count: " + returnedVideo.getStatistics().getViewCount());
//
//                    } catch (GoogleJsonResponseException e) {
//                        System.err.println("GoogleJsonResponseException code: " + e.getDetails().getCode() + " : "
//                                + e.getDetails().getMessage());
//                        e.printStackTrace();
//                    } catch (IOException e) {
//                        System.err.println("IOException: " + e.getMessage());
//                        e.printStackTrace();
//                    } catch (Throwable t) {
//                        System.err.println("Throwable: " + t.getMessage());
//                        t.printStackTrace();
//                    }


                } else return new ArrayList() {{
                    add(new HashMap<String, String>() {{
                        put("file", "not uploaded");
                    }});
                }};
            }
        }

        Field<Timestamp> date = (Field<Timestamp>) record.field("Date");
        if (date != null)
            record.set(date, new Timestamp(System.currentTimeMillis()));

        record.store();

        List list = new ArrayList<>();
        list.add(record.into(tableClass));

        return list;
    }

    public List updateByID(String tableName, Object form, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return updateByID(table, selectFields, tableClass, form, id);
    }

    public List updateByID(Table table, Field[] selectFields, Class tableClass, Object form, String id) throws SQLException {
        UpdatableRecord record = (UpdatableRecord) getDslContext().newRecord(table);
        Object l = getByID(table, selectFields, tableClass, record, id).get(0);

        record.from(l);
        if (Tables.USER.equals(table)) {
            User user = (User) form;
            Map<String, String> data = formFactory.form().bindFromRequest().data();

            String password;
            password = ((UserRecord) record).getPassword();
            boolean checkpw = BCrypt.checkpw(user.getPassword(), password);
            if (!checkpw)
                return null;
            user.setPassword(null);
            if (!data.getOrDefault("newPass", "").equals("")) {
                user.setPassword(BCrypt.hashpw(data.get("newPass"), BCrypt.gensalt()));
//                form = user;
            }
            user.setUserId(Integer.valueOf(id));
            form = user;
        }

        record.from((form));
//        record.set(table.field("ID"), id);
        record.update();

        List list = new ArrayList<>();
        list.add(record.into(tableClass));

        return list;
    }

    private DSLContext getDslContext() {
        return DSL.using(new PlayConnectionProvider().acquire(), SQLDialect.MYSQL);
    }

    public List getWhereCondition(String tableName, String[] conditions, Map<String, String> data) {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        SelectJoinStep from = getDslContext().select(selectFields).from(table);

        List<Map.Entry<String, String>> lm = new ArrayList<>(data.entrySet());

        String ki, kj;
        for (int i = 0, j = 1; i < lm.size(); i++, j++) {
            if (i < conditions.length && j < lm.size()) {
                switch (conditions[i].toUpperCase()) {
                    case "AND":
                        ki = lm.get(i).getKey().replaceAll("%", "");
                        kj = lm.get(j).getKey().replaceAll("%", "");

                        from.where(table.field(ki).equal(lm.get(i).getValue())).and(table.field(kj).equal(lm.get(j).getValue()));
                        break;
                    case "OR":
                        ki = lm.get(i).getKey().replaceAll("%", "");
                        kj = lm.get(j).getKey().replaceAll("%", "");

                        from.where(table.field(ki).equal(lm.get(i).getValue())).or(table.field(kj).equal(lm.get(j).getValue()));
                        break;
                    case "ORNOT":
                        ki = lm.get(i).getKey().replaceAll("%", "");
                        kj = lm.get(j).getKey().replaceAll("%", "");

                        from.where(table.field(ki).equal(lm.get(i).getValue())).orNot(table.field(kj).equal(lm.get(j).getValue()));
                        break;

                    case "ANDNOT":
                        ki = lm.get(i).getKey().replaceAll("%", "");
                        kj = lm.get(j).getKey().replaceAll("%", "");

                        from.where(table.field(ki).equal(lm.get(i).getValue())).andNot(table.field(kj).equal(lm.get(j).getValue()));
                        break;

                }
                i++;
                j++;
            } else {
                ki = lm.get(i).getKey().replaceAll("%", "");
                from.where(table.field(ki).equal(lm.get(i).getValue()));
            }
        }
        return from.fetch().into(tableClass);
    }

    public List getAllPost(String tableName) {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);
        String id = session("id");
        return getDslContext().select(selectFields).from(table).where(Tables.POST.USER_ID.equal(Integer.valueOf(id))).fetch().into(tableClass);

    }

    public List getTopRatedUsers(String cat) throws SQLException {
        List<Field<?>> fields = new ArrayList();
        fields.addAll(Arrays.asList(Tables.USER.fields()));
//        fields.addAll(Arrays.asList(Tables.RATE.fields()));
        fields.add(Tables.POST.CATEGORY_ID);
        Field<BigDecimal> totalRate = sum(Tables.RATE.RATING).div(count()).as("totalRate");
        fields.add(totalRate);

        Field<?>[] f = new Field[fields.size()];
        for (int i = 0; i < fields.size(); i++) {
            f[i] = fields.get(i);
        }

        if (cat.equals("null"))
            return getDslContext().select(f).from(Tables.RATE).join(Tables.POST).on(Tables.POST.POST_ID.equal(Tables.RATE.POST_ID)).join(Tables.USER).on(Tables.USER.USER_ID.equal(Tables.POST.USER_ID)).groupBy(Tables.POST.USER_ID).orderBy(totalRate.desc()).fetchMaps();


        return getDslContext().select(f).from(Tables.RATE).join(Tables.POST).on(Tables.POST.POST_ID.equal(Tables.RATE.POST_ID)).join(Tables.USER).on(Tables.USER.USER_ID.equal(Tables.POST.USER_ID)).where(Tables.POST.CATEGORY_ID.equal(Integer.valueOf(cat))).groupBy(Tables.POST.USER_ID).orderBy(totalRate.desc()).fetchMaps();

    }

    public List getTopRatedPosts(String cat) throws SQLException {
        List<Field<?>> fields = new ArrayList();
        fields.addAll(Arrays.asList(Tables.POST.fields()));
//        fields.addAll(Arrays.asList(Tables.RATE.fields()));

        Field<BigDecimal> totalRate = sum(Tables.RATE.RATING).div(count()).as("totalRate");
        fields.add(totalRate);
        Field<?>[] f = new Field[fields.size()];
        for (int i = 0; i < fields.size(); i++) {
            f[i] = fields.get(i);
        }
        if (cat.equals("null"))
            return getDslContext().select(f).from(Tables.RATE).join(Tables.POST).on(Tables.POST.POST_ID.equal(Tables.RATE.POST_ID)).groupBy(Tables.POST.POST_ID).orderBy(totalRate.desc()).fetchMaps();


        return getDslContext().select(f).from(Tables.RATE).join(Tables.POST).on(Tables.POST.POST_ID.equal(Tables.RATE.POST_ID)).where(Tables.POST.CATEGORY_ID.equal(Integer.valueOf(cat))).groupBy(Tables.POST.POST_ID).orderBy(totalRate.desc()).fetchMaps();
    }
}