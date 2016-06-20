package controllers;

import models.RESTHelper;
import models.talentDB.tables.pojos.Post;
import models.talentDB.tables.pojos.PostTag;
import models.talentDB.tables.pojos.Tag;
import models.talentDB.tables.pojos.User;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RESTRouter extends Controller {

    @Inject
    RESTHelper restHelper;
    @Inject
    FormFactory formFactory;

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

        return play.mvc.Results.TODO;
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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return badRequest("{\"error\":\"bad request\"}");


    }

    public Result getWhereWithCondition(String table, String condition) {

        String[] conditions = condition.split("/");
        Map<String, String> data = formFactory.form().bindFromRequest().data();
        try {
            List list = restHelper.getWhereCondition(table, conditions, data);
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