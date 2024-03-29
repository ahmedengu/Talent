/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.records;


import models.talentDB.tables.Post;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
@Table(name = "Post", schema = "talent")
public class PostRecord extends UpdatableRecordImpl<PostRecord> implements Record8<Integer, Integer, Integer, Double, Timestamp, String, Integer, String> {

    private static final long serialVersionUID = 1152794451;

    /**
     * Create a detached PostRecord
     */
    public PostRecord() {
        super(Post.POST);
    }

    /**
     * Create a detached, initialised PostRecord
     */
    public PostRecord(Integer postId, Integer userId, Integer categoryId, Double totalRating, Timestamp date, String posturl, Integer ratingcount, String tags) {
        super(Post.POST);

        set(0, postId);
        set(1, userId);
        set(2, categoryId);
        set(3, totalRating);
        set(4, date);
        set(5, posturl);
        set(6, ratingcount);
        set(7, tags);
    }

    /**
     * Getter for <code>talent.Post.Post_ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Post_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getPostId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talent.Post.Post_ID</code>.
     */
    public void setPostId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talent.Post.User_ID</code>.
     */
    @Column(name = "User_ID", nullable = false, precision = 10)
    @NotNull
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>talent.Post.User_ID</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>talent.Post.Category_ID</code>.
     */
    @Column(name = "Category_ID", nullable = false, precision = 10)
    @NotNull
    public Integer getCategoryId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>talent.Post.Category_ID</code>.
     */
    public void setCategoryId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>talent.Post.Total_Rating</code>.
     */
    @Column(name = "Total_Rating", nullable = false, precision = 12)
    public Double getTotalRating() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>talent.Post.Total_Rating</code>.
     */
    public void setTotalRating(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>talent.Post.Date</code>.
     */
    @Column(name = "Date", nullable = false)
    public Timestamp getDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>talent.Post.Date</code>.
     */
    public void setDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>talent.Post.PostUrl</code>.
     */
    @Column(name = "PostUrl", nullable = false, length = 1000)
    @NotNull
    @Size(max = 1000)
    public String getPosturl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>talent.Post.PostUrl</code>.
     */
    public void setPosturl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>talent.Post.RatingCount</code>.
     */
    @Column(name = "RatingCount", nullable = false, precision = 10)
    public Integer getRatingcount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>talent.Post.RatingCount</code>.
     */
    public void setRatingcount(Integer value) {
        set(6, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>talent.Post.tags</code>.
     */
    @Column(name = "tags", length = 65535)
    @Size(max = 65535)
    public String getTags() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>talent.Post.tags</code>.
     */
    public void setTags(String value) {
        set(7, value);
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
    public Row8<Integer, Integer, Integer, Double, Timestamp, String, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Double, Timestamp, String, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Post.POST.POST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Post.POST.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Post.POST.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Post.POST.TOTAL_RATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Post.POST.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Post.POST.POSTURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Post.POST.RATINGCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Post.POST.TAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPostId();
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
    public Integer value3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getTotalRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPosturl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRatingcount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value1(Integer value) {
        setPostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value3(Integer value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value4(Double value) {
        setTotalRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value5(Timestamp value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value6(String value) {
        setPosturl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value7(Integer value) {
        setRatingcount(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord value8(String value) {
        setTags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostRecord values(Integer value1, Integer value2, Integer value3, Double value4, Timestamp value5, String value6, Integer value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }
}
