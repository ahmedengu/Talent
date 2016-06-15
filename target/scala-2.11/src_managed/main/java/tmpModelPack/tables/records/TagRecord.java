/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables.records;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import tmpModelPack.tables.Tag;


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
@Table(name = "Tag", schema = "talent")
public class TagRecord extends UpdatableRecordImpl<TagRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 975699083;

    /**
     * Setter for <code>talent.Tag.Tag_ID</code>.
     */
    public void setTagId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talent.Tag.Tag_ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Tag_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getTagId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talent.Tag.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>talent.Tag.Name</code>.
     */
    @Column(name = "Name", unique = true, nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>talent.Tag.Number_Of_Posts</code>.
     */
    public void setNumberOfPosts(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>talent.Tag.Number_Of_Posts</code>.
     */
    @Column(name = "Number_Of_Posts", nullable = false, precision = 10)
    @NotNull
    public Integer getNumberOfPosts() {
        return (Integer) get(2);
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
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tag.TAG.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tag.TAG.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Tag.TAG.NUMBER_OF_POSTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getNumberOfPosts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value1(Integer value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord value3(Integer value) {
        setNumberOfPosts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TagRecord
     */
    public TagRecord() {
        super(Tag.TAG);
    }

    /**
     * Create a detached, initialised TagRecord
     */
    public TagRecord(Integer tagId, String name, Integer numberOfPosts) {
        super(Tag.TAG);

        set(0, tagId);
        set(1, name);
        set(2, numberOfPosts);
    }
}