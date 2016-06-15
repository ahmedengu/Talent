package controllers;

import models.RESTHelper;
import models.talentDB.tables.pojos.User;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import models.talentDB.*;
import models.talentDB.tables.*;
import models.talentDB.tables.daos.*;
import models.talentDB.tables.pojos.*;
import models.talentDB.tables.records.*;

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

    public  Result indexHome() {
        return play.mvc.Results.TODO;
    }


    public Result login() {
        Map<String, String> data = formFactory.form().bindFromRequest().data();
        String email = data.get("email");
        String password = data.get("password");
        try {
            User login = restHelper.login(email, password);
            return ok(Json.toJson(login));
        } catch (SQLException e) {
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





    public play.mvc.Result list(String tableName) {

        List result = null;
        try {
            result = restHelper.getAll(tableName);
            return ok(Json.toJson(result));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");

    }

    public play.mvc.Result getByID(String tableName, String id) {

        List result = null;
        try {
            result = restHelper.getByID(tableName, id);
            return ok(Json.toJson(result));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");

    }


    public play.mvc.Result deleteByID(String tableName, String id) {

        List result = null;
        try {
            result = restHelper.deleteByID(tableName, id);
            return ok(Json.toJson(result));
        } catch (SQLException e) {
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
                List result = restHelper.create(tableName, form);
                if (result.size() > 0) {
                    return created(Json.toJson(result));
                }
            } catch (SQLException e) {
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

            Form form = formFactory.form().bindFromRequest();
            result = restHelper.updateByID(tableName, form, id);
            return ok(Json.toJson(result));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return badRequest("{\"error\":\"bad request\"}");
    }
}