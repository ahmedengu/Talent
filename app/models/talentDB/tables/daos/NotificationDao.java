/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.daos;


import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import models.talentDB.tables.Notification;
import models.talentDB.tables.records.NotificationRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationDao extends DAOImpl<NotificationRecord, models.talentDB.tables.pojos.Notification, Integer> {

    /**
     * Create a new NotificationDao without any configuration
     */
    public NotificationDao() {
        super(Notification.NOTIFICATION, models.talentDB.tables.pojos.Notification.class);
    }

    /**
     * Create a new NotificationDao with an attached configuration
     */
    public NotificationDao(Configuration configuration) {
        super(Notification.NOTIFICATION, models.talentDB.tables.pojos.Notification.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.talentDB.tables.pojos.Notification object) {
        return object.getNotificationId();
    }

    /**
     * Fetch records that have <code>Notification_ID IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Notification> fetchByNotificationId(Integer... values) {
        return fetch(Notification.NOTIFICATION.NOTIFICATION_ID, values);
    }

    /**
     * Fetch a unique record that has <code>Notification_ID = value</code>
     */
    public models.talentDB.tables.pojos.Notification fetchOneByNotificationId(Integer value) {
        return fetchOne(Notification.NOTIFICATION.NOTIFICATION_ID, value);
    }

    /**
     * Fetch records that have <code>User_ID IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Notification> fetchByUserId(Integer... values) {
        return fetch(Notification.NOTIFICATION.USER_ID, values);
    }

    /**
     * Fetch records that have <code>Date IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Notification> fetchByDate(Date... values) {
        return fetch(Notification.NOTIFICATION.DATE, values);
    }

    /**
     * Fetch records that have <code>Time IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Notification> fetchByTime(Time... values) {
        return fetch(Notification.NOTIFICATION.TIME, values);
    }

    /**
     * Fetch records that have <code>Type IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Notification> fetchByType(String... values) {
        return fetch(Notification.NOTIFICATION.TYPE, values);
    }
}