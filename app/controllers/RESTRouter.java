package controllers;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.StoredCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeRequestUrl;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.common.collect.Lists;
import models.RESTHelper;
import models.talentDB.tables.pojos.Post;
import models.talentDB.tables.pojos.PostTag;
import models.talentDB.tables.pojos.Tag;
import models.talentDB.tables.pojos.User;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import play.api.libs.ws.WSClient;
import play.api.libs.ws.WSRequest;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static controllers.Auth.*;

public class RESTRouter extends Controller {

    @Inject
    RESTHelper restHelper;
    @Inject
    FormFactory formFactory;
//    @Inject
//    WSClient ws;

//    public  Result getRefreshToken() {
//        List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube.upload");
//
//        Credential credential = null;
//        try {
//            credential = Auth.authorize(scopes, "uploadvideo");
//            String refreshToken = credential.getRefreshToken();
//
//            return ok(refreshToken);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ok("faild");    }

//    public Result setRefreshToken() throws IOException {
//        Map<String, String> data = formFactory.form().bindFromRequest().data();
//        if(!data.getOrDefault("code","").equals("")){
//            String code = data.get("code");
//            if (!session().getOrDefault("id", "").equals("")&&code!=null) {
////                ws.url()
//
//                session("token",code);
//                try {
//                    List where = restHelper.getByID("user",session("id"));
//                    return ok(Json.toJson(where.get(0)));
//
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }else {
//            List<String> scopes = Lists.newArrayList("https://www.googleapis.com/auth/youtube.upload");
//
//            GoogleClientSecrets googleClientSecrets = new GoogleClientSecrets();
//            googleClientSecrets.setWeb(new GoogleClientSecrets.Details().setClientId(clientId).setClientSecret(clientSecret));
//            GoogleClientSecrets clientSecrets = googleClientSecrets;
//            // This creates the credentials datastore at ~/.oauth-credentials/${credentialDatastore}
//
//            FileDataStoreFactory fileDataStoreFactory = new FileDataStoreFactory(new File(System.getProperty("user.home") + "/" + CREDENTIALS_DIRECTORY));
//            DataStore<StoredCredential> datastore = fileDataStoreFactory.getDataStore("uploadvideo");
//
//            GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
//                    HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, scopes).setCredentialDataStore(datastore)
//                    .build();
//            GoogleAuthorizationCodeRequestUrl googleAuthorizationCodeRequestUrl = flow.newAuthorizationUrl();
//            googleAuthorizationCodeRequestUrl.setRedirectUri("http://localhost:9000/setRefreshToken");
//            googleAuthorizationCodeRequestUrl.setApprovalPrompt("force").setAccessType("offline");
//            String build = googleAuthorizationCodeRequestUrl.build();
//
//
//            return redirect(build);
//
//        }
//
//        return ok("you need to login");
//    }
//
//    public Result u() {
//        restHelper.youtubeUpload("C:\\Users\\ahmedengu\\Documents\\IdeaProjects\\Talent\\sample-video.mp4", "user video", "", new ArrayList<String>() {{
//            add("sport");
//        }});
//        return ok();
//    }

    public Result topRatedUsers(String cat) {
        try {
            return ok(Json.toJson(restHelper.getTopRatedUsers(cat)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");
    }

    public Result topRatedPosts(String cat) {

        try {
            return ok(Json.toJson(restHelper.getTopRatedPosts(cat)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");
    }

    public Result logout() {
        String id = session("id");
        if (id == null) return badRequest("{\"error\":\"bad request\"}");

        session().clear();

        return ok("{\"logout\":\"" + id + "\"}");

    }

    public Result indexHome() {

        return ok(views.html.index.render());
    }


    public Result login() {
        Map<String, String> data = formFactory.form().bindFromRequest().data();
        String email = data.get("email");
        String password = data.get("password");
        try {
            session().clear();
            User user = restHelper.login(email, password);
            session("id", user.getUserId().toString());
            session("email", user.getEmail().toString());

            return ok(Json.toJson(user));
//            return setRefreshToken();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return badRequest("{\"error\":\"bad request\"}");


    }

    public Result getWhereWithCondition(String table, String condition) {

        String[] conditions = condition.split("/");
        Map<String, String> data = formFactory.form().bindFromRequest().data();
        try {
            List list;
            if(table.toLowerCase().equals("user")) {
                list = restHelper.getWhereCondition("usergetall", conditions, data);
            }
                else
             list = restHelper.getWhereCondition(table, conditions, data);
            if (list.size() > 0) {
                return ok(Json.toJson(list));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");
    }


    public play.mvc.Result list(String tableName, String page) {

        List result = null;
        try {

            if (page.equals("null"))
                result = restHelper.getAll(tableName, null);
            else if (page.length() > 0)
                result = restHelper.getAll(tableName, page);
            return ok(Json.toJson(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");

    }

    public play.mvc.Result getByID(String tableName, String id) {

        String id1 = session("id");
        List result = null;
        try {
//            if (!session("id").equals(id))
//                return badRequest("{\"error\":\"bad request\"}");

            if (tableName.toLowerCase().equals("user")) {
                Field[] selectFields;
                String id2 = session("id");
                if (session("id") != null && id2.equals(id))
                    selectFields = restHelper.getSelectFieldsByName(tableName);
                else
                    selectFields = restHelper.getSelectFieldsByName("USERGETALL");

                Table table = restHelper.getTableByName(tableName);
                Class tableClass = restHelper.getClassByName(tableName);
                UpdatableRecord record = restHelper.getRecordByName(tableName);


                result = restHelper.getByID(table, selectFields, tableClass, record, id);

            } else
                result = restHelper.getByID(tableName, id);

            return ok(Json.toJson(result.get(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");

    }


    public play.mvc.Result deleteByID(String tableName, String id) {

        List result = null;
        try {
            result = restHelper.deleteByID(tableName, id);


            if (tableName.toLowerCase().equals("post")) {
                restHelper.deletePostTag("post_tag", id);
            }


            return ok("{\"affected rows\":" + Json.toJson(result.get(0)) + "}");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");
    }

    public play.mvc.Result create(String tableName) {

        Class aClass = RESTHelper.getClassByName(tableName);
        Form form = formFactory.form(aClass).bindFromRequest();

        if (form.hasErrors()) {
            return badRequest("{\"error\":" + form.errorsAsJson() + "}");
        } else {
            try {

                if (!form.data().getOrDefault("userId", "").equals("") && !session("id").equals(form.data().get("userId")) || !form.data().getOrDefault("follower", "").equals("") && !session("id").equals(form.data().get("follower")))
                    return badRequest("{\"error\":\"bad request\"}");


                List result = restHelper.create(tableName, form);

                if (tableName.toLowerCase().equals("post")) {
                    Map<String, String> data = formFactory.form().bindFromRequest().data();

                    if (!data.getOrDefault("tags", "").equals("")) {
                        String[] tags = data.get("tags").toString().split(",");
                        List<Integer> tagsIDs = new ArrayList<>();
                        for (int i = 0; i < tags.length; i++) {
                            List<Tag> where = restHelper.getWhere("tag", "Name", tags[i]);
                            if (where.size() > 0) {
                                tagsIDs.add(where.get(0).getTagId());
                            } else {
                                Form<Tag> ff = formFactory.form(Tag.class);
                                Tag tag = new Tag();
                                tag.setName(tags[i]);
                                ff = ff.fill(tag);
                                List<Tag> list = restHelper.create("Tag", ff);
                                tagsIDs.add(list.get(0).getTagId());
                            }
                        }
                        Integer postId = ((Post) result.get(0)).getPostId();
                        for (int i = 0; i < tagsIDs.size(); i++) {
                            Form<PostTag> ff = formFactory.form(PostTag.class);
                            PostTag postTag = new PostTag();
                            postTag.setPostId(postId);
                            postTag.setTagId(tagsIDs.get(i));

                            ff = ff.fill(postTag);
                            restHelper.create("post_tag", ff);
                        }

                    }
                }

                if (result.size() > 0) {
                    return created(Json.toJson(result.get(0)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return badRequest("{\"error\":\"bad request\"}");
    }

    public play.mvc.Result updateByID(String tableName, String id) {

        List result = null;
        try {
            Class aClass = RESTHelper.getClassByName(tableName);
//            Form form = formFactory.form(aClass).bindFromRequest();
            Form f = formFactory.form(aClass).bindFromRequest();

            if (f.hasErrors())
                return badRequest("{\"error\":" + f.errorsAsJson() + "}");

            Object form = formFactory.form(aClass).bindFromRequest().get();
            if (tableName.toLowerCase().equals("user") && !session("id").equals(id))
                return badRequest("{\"error\":\"bad request\"}");

            result = restHelper.updateByID(tableName, form, id);

            if (tableName.toLowerCase().equals("post")) {
                Map<String, String> data = formFactory.form().bindFromRequest().data();

                if (!data.getOrDefault("tags", "").equals("")) {
                    Integer postId = Integer.valueOf(id);


                    restHelper.deletePostTag("post_tag", String.valueOf(id));

                    String[] tags = data.get("tags").toString().split(",");
                    List<Integer> tagsIDs = new ArrayList<>();
                    for (int i = 0; i < tags.length; i++) {
                        List<Tag> where = restHelper.getWhere("tag", "Name", tags[i]);
                        if (where.size() > 0) {
                            tagsIDs.add(where.get(0).getTagId());
                        } else {
                            Form<Tag> ff = formFactory.form(Tag.class);
                            Tag tag = new Tag();
                            tag.setName(tags[i]);
                            ff = ff.fill(tag);
                            List<Tag> list = restHelper.create("Tag", ff);
                            tagsIDs.add(list.get(0).getTagId());
                        }
                    }
                    for (int i = 0; i < tagsIDs.size(); i++) {
                        Form<PostTag> ff = formFactory.form(PostTag.class);
                        PostTag postTag = new PostTag();
                        postTag.setPostId(postId);
                        postTag.setTagId(tagsIDs.get(i));

                        ff = ff.fill(postTag);
                        restHelper.create("post_tag", ff);
                    }

                }
            }

            return ok(Json.toJson(result.get(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");
    }
}