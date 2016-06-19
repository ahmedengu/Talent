/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.records;


import models.talentDB.tables.Notification;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
@Entity
@Table(name = "Notification", schema = "talent")
public class NotificationRecord extends UpdatableRecordImpl<NotificationRecord> implements Record4<Integer, Integer, Timestamp, String> {

    private static final long serialVersionUID = 1450757239;

    /**
     * Create a detached NotificationRecord
     */
    public NotificationRecord() {
        super(Notification.NOTIFICATION);
    }

    /**
     * Create a detached, initialised NotificationRecord
     */
    public NotificationRecord(Integer notificationId, Integer userId, Timestamp date, String type) {
        super(Notification.NOTIFICATION);

        set(0, notificationId);
        set(1, userId);
        set(2, date);
        set(3, type);
    }

    /**
     * Getter for <code>talent.Notification.Notification_ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Notification_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getNotificationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talent.Notification.Notification_ID</code>.
     */
    public void setNotificationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talent.Notification.User_ID</code>.
     */
    @Column(name = "User_ID", nullable = false, precision = 10)
    @NotNull
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>talent.Notification.User_ID</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>talent.Notification.Date</code>.
     */
    @Column(name = "Date", nullable = false)
    public Timestamp getDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>talent.Notification.Date</code>.
     */
    public void setDate(Timestamp value) {
        set(2, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>talent.Notification.Type</code>.
     */
    @Column(name = "Type", nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getType() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>talent.Notification.Type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Notification.NOTIFICATION.NOTIFICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Notification.NOTIFICATION.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Notification.NOTIFICATION.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Notification.NOTIFICATION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNotificationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationRecord value1(Integer value) {
        setNotificationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationRecord value3(Timestamp value) {
        setDate(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationRecord values(Integer value1, Integer value2, Timestamp value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }
}
