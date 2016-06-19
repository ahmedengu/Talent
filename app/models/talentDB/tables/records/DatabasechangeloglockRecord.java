/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.records;


import models.talentDB.tables.Databasechangeloglock;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Table(name = "DATABASECHANGELOGLOCK", schema = "talent")
public class DatabasechangeloglockRecord extends UpdatableRecordImpl<DatabasechangeloglockRecord> implements Record4<Integer, Boolean, Timestamp, String> {

    private static final long serialVersionUID = 1542135567;

    /**
     * Create a detached DatabasechangeloglockRecord
     */
    public DatabasechangeloglockRecord() {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);
    }

    /**
     * Create a detached, initialised DatabasechangeloglockRecord
     */
    public DatabasechangeloglockRecord(Integer id, Boolean locked, Timestamp lockgranted, String lockedby) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);

        set(0, id);
        set(1, locked);
        set(2, lockgranted);
        set(3, lockedby);
    }

    /**
     * Getter for <code>talent.DATABASECHANGELOGLOCK.ID</code>.
     */
    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talent.DATABASECHANGELOGLOCK.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talent.DATABASECHANGELOGLOCK.LOCKED</code>.
     */
    @Column(name = "LOCKED", nullable = false, precision = 1)
    @NotNull
    public Boolean getLocked() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>talent.DATABASECHANGELOGLOCK.LOCKED</code>.
     */
    public void setLocked(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>talent.DATABASECHANGELOGLOCK.LOCKGRANTED</code>.
     */
    @Column(name = "LOCKGRANTED")
    public Timestamp getLockgranted() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>talent.DATABASECHANGELOGLOCK.LOCKGRANTED</code>.
     */
    public void setLockgranted(Timestamp value) {
        set(2, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>talent.DATABASECHANGELOGLOCK.LOCKEDBY</code>.
     */
    @Column(name = "LOCKEDBY", length = 255)
    @Size(max = 255)
    public String getLockedby() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>talent.DATABASECHANGELOGLOCK.LOCKEDBY</code>.
     */
    public void setLockedby(String value) {
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
    public Row4<Integer, Boolean, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Boolean, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getLocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLockgranted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLockedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangeloglockRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangeloglockRecord value2(Boolean value) {
        setLocked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangeloglockRecord value3(Timestamp value) {
        setLockgranted(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangeloglockRecord value4(String value) {
        setLockedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabasechangeloglockRecord values(Integer value1, Boolean value2, Timestamp value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }
}
