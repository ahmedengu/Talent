package models;

import models.talentDB.tables.pojos.User;
import org.jooq.*;
import org.jooq.impl.DSL;

import org.mindrot.jbcrypt.BCrypt;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;

import javax.crypto.spec.PBEKeySpec;
import javax.inject.Inject;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;
import models.talentDB.*;
import models.talentDB.tables.*;
import models.talentDB.tables.daos.*;
import models.talentDB.tables.pojos.*;
import models.talentDB.tables.records.*;
import scala.reflect.internal.Trees;

import static play.data.Form.form;
import static play.mvc.Controller.request;

public class RESTHelper {

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
    public List getAll(String tableName) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);
        return getAll(table, selectFields, tableClass);
    }

    public List getAll(String tableName, int i) throws SQLException {
        if (i == 0) {
            Table table = getTableByName(tableName);
            Class tableClass = getClassByName(tableName);
            Field[] selectFields = getSelectFieldsByName(tableName);
            return getAll(table, selectFields, tableClass);
        } else {
            Table table = getTableByName(tableName);
            Field[] selectFields = getSelectFieldsByName(tableName);
            return getAll(table, selectFields);
        }
    }

    public List getAll(Table table, Field[] selectFields, Class tableClass) throws SQLException {
        return getDslContext().select(selectFields).from(table).fetch().into(tableClass);
    }

    public List getAll(Table table, Field[] selectFields) throws SQLException {
        return getDslContext().select(selectFields).from(table).fetch();
    }

    public List getByID(String tableName, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return getByID(table, selectFields, tableClass, record, id);
    }

    public List getByID(Table table, Field[] selectFields, Class tableClass, UpdatableRecord record, String id) throws SQLException {
        return getDslContext().select(selectFields).from(table).where("id = ?", id).fetch().into(tableClass);
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

    public List deleteByID(String tableName, String id) throws SQLException {
        Table table = getTableByName(tableName);
        Class tableClass = getClassByName(tableName);
        UpdatableRecord record = getRecordByName(tableName);
        Field[] selectFields = getSelectFieldsByName(tableName);

        return deleteByID(table, selectFields, tableClass, record, id);
    }

    public List deleteByID(Table table, Field[] selectFields, Class tableClass, UpdatableRecord record, String id) throws SQLException {
        List list = new ArrayList<>();
        int deletedRecord = getDslContext().delete(table).where("id = ?", id).execute();


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

        }
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
        Map<String, String> data = ((Form) form).data();

        record.from(data);
//        record.set(table.field("ID"), id);
        record.update();

        List list = new ArrayList<>();
        list.add(record.into(tableClass));

        return list;
    }

    private DSLContext getDslContext() {
        return DSL.using(new PlayConnectionProvider().acquire(), SQLDialect.MYSQL);
    }

    public static Table getTableByName(String table) {
        switch (table.toUpperCase()) {
            case "USER":
              return  Tables.USER;
        }
        return null;
    }

    public static Class getClassByName(String table) {
        switch (table.toUpperCase()) {
            case "USER":
                return User.class;

        }
        return null;
    }

    public static Field[] getSelectFieldsByName(String table) {
        switch (table.toUpperCase()) {
            case "USER":
                return Tables.USER.fields();
        }
        return null;
    }

    public static UpdatableRecord getRecordByName(String table) {
        switch (table.toUpperCase()) {
            case "USER":
                return new UserRecord();
        }
        return null;
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
}