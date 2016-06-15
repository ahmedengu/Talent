/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.records;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import models.talentDB.tables.Rate;


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
@Table(name = "Rate", schema = "talent")
public class RateRecord extends UpdatableRecordImpl<RateRecord> implements Record3<Integer, Integer, Double> {

    private static final long serialVersionUID = -379509142;

    /**
     * Setter for <code>talent.Rate.Notification_ID</code>.
     */
    public void setNotificationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talent.Rate.Notification_ID</code>.
     */
    @Id
    @Column(name = "Notification_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getNotificationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talent.Rate.Post_ID</code>.
     */
    public void setPostId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>talent.Rate.Post_ID</code>.
     */
    @Column(name = "Post_ID", nullable = false, precision = 10)
    @NotNull
    public Integer getPostId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>talent.Rate.Rating</code>.
     */
    public void setRating(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>talent.Rate.Rating</code>.
     */
    @Column(name = "Rating", nullable = false, precision = 12)
    @NotNull
    public Double getRating() {
        return (Double) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Double> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Rate.RATE.NOTIFICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Rate.RATE.POST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Rate.RATE.RATING;
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
    public Double value3() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RateRecord value1(Integer value) {
        setNotificationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RateRecord value2(Integer value) {
        setPostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RateRecord value3(Double value) {
        setRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RateRecord values(Integer value1, Integer value2, Double value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RateRecord
     */
    public RateRecord() {
        super(Rate.RATE);
    }

    /**
     * Create a detached, initialised RateRecord
     */
    public RateRecord(Integer notificationId, Integer postId, Double rating) {
        super(Rate.RATE);

        set(0, notificationId);
        set(1, postId);
        set(2, rating);
    }
}