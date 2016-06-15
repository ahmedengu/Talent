/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables.records;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import tmpModelPack.tables.Like;


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
@Entity
@Table(name = "Like", schema = "talent")
public class LikeRecord extends UpdatableRecordImpl<LikeRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1220903008;

    /**
     * Setter for <code>talent.Like.Notification_ID</code>.
     */
    public void setNotificationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talent.Like.Notification_ID</code>.
     */
    @Id
    @Column(name = "Notification_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getNotificationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talent.Like.Post_ID</code>.
     */
    public void setPostId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>talent.Like.Post_ID</code>.
     */
    @Column(name = "Post_ID", nullable = false, precision = 10)
    @NotNull
    public Integer getPostId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Like.LIKE.NOTIFICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Like.LIKE.POST_ID;
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
        return getPostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LikeRecord value1(Integer value) {
        setNotificationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LikeRecord value2(Integer value) {
        setPostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LikeRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LikeRecord
     */
    public LikeRecord() {
        super(Like.LIKE);
    }

    /**
     * Create a detached, initialised LikeRecord
     */
    public LikeRecord(Integer notificationId, Integer postId) {
        super(Like.LIKE);

        set(0, notificationId);
        set(1, postId);
    }
}