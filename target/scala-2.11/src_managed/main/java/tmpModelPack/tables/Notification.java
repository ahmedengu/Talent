/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables;


import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import tmpModelPack.Keys;
import tmpModelPack.Talent;
import tmpModelPack.tables.records.NotificationRecord;


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
public class Notification extends TableImpl<NotificationRecord> {

    private static final long serialVersionUID = -1325912308;

    /**
     * The reference instance of <code>talent.Notification</code>
     */
    public static final Notification NOTIFICATION = new Notification();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationRecord> getRecordType() {
        return NotificationRecord.class;
    }

    /**
     * The column <code>talent.Notification.Notification_ID</code>.
     */
    public final TableField<NotificationRecord, Integer> NOTIFICATION_ID = createField("Notification_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>talent.Notification.User_ID</code>.
     */
    public final TableField<NotificationRecord, Integer> USER_ID = createField("User_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>talent.Notification.Date</code>.
     */
    public final TableField<NotificationRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>talent.Notification.Time</code>.
     */
    public final TableField<NotificationRecord, Time> TIME = createField("Time", org.jooq.impl.SQLDataType.TIME.nullable(false), this, "");

    /**
     * The column <code>talent.Notification.Type</code>.
     */
    public final TableField<NotificationRecord, String> TYPE = createField("Type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>talent.Notification</code> table reference
     */
    public Notification() {
        this("Notification", null);
    }

    /**
     * Create an aliased <code>talent.Notification</code> table reference
     */
    public Notification(String alias) {
        this(alias, NOTIFICATION);
    }

    private Notification(String alias, Table<NotificationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Notification(String alias, Table<NotificationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Talent.TALENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<NotificationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NotificationRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NotificationRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationRecord>>asList(Keys.KEY_NOTIFICATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<NotificationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NotificationRecord, ?>>asList(Keys.FKNOTIFICATI729821);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Notification as(String alias) {
        return new Notification(alias, this);
    }

    /**
     * Rename this table
     */
    public Notification rename(String name) {
        return new Notification(name, null);
    }
}
