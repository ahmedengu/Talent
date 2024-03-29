/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables;


import models.talentDB.Keys;
import models.talentDB.Talent;
import models.talentDB.tables.records.DatabasechangeloglockRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class Databasechangeloglock extends TableImpl<DatabasechangeloglockRecord> {

    /**
     * The reference instance of <code>talent.DATABASECHANGELOGLOCK</code>
     */
    public static final Databasechangeloglock DATABASECHANGELOGLOCK = new Databasechangeloglock();
    private static final long serialVersionUID = -1533740452;
    /**
     * The column <code>talent.DATABASECHANGELOGLOCK.ID</code>.
     */
    public final TableField<DatabasechangeloglockRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.DATABASECHANGELOGLOCK.LOCKED</code>.
     */
    public final TableField<DatabasechangeloglockRecord, Boolean> LOCKED = createField("LOCKED", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");
    /**
     * The column <code>talent.DATABASECHANGELOGLOCK.LOCKGRANTED</code>.
     */
    public final TableField<DatabasechangeloglockRecord, Timestamp> LOCKGRANTED = createField("LOCKGRANTED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");
    /**
     * The column <code>talent.DATABASECHANGELOGLOCK.LOCKEDBY</code>.
     */
    public final TableField<DatabasechangeloglockRecord, String> LOCKEDBY = createField("LOCKEDBY", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>talent.DATABASECHANGELOGLOCK</code> table reference
     */
    public Databasechangeloglock() {
        this("DATABASECHANGELOGLOCK", null);
    }

    /**
     * Create an aliased <code>talent.DATABASECHANGELOGLOCK</code> table reference
     */
    public Databasechangeloglock(String alias) {
        this(alias, DATABASECHANGELOGLOCK);
    }

    private Databasechangeloglock(String alias, Table<DatabasechangeloglockRecord> aliased) {
        this(alias, aliased, null);
    }

    private Databasechangeloglock(String alias, Table<DatabasechangeloglockRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatabasechangeloglockRecord> getRecordType() {
        return DatabasechangeloglockRecord.class;
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
    public UniqueKey<DatabasechangeloglockRecord> getPrimaryKey() {
        return Keys.KEY_DATABASECHANGELOGLOCK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatabasechangeloglockRecord>> getKeys() {
        return Arrays.<UniqueKey<DatabasechangeloglockRecord>>asList(Keys.KEY_DATABASECHANGELOGLOCK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Databasechangeloglock as(String alias) {
        return new Databasechangeloglock(alias, this);
    }

    /**
     * Rename this table
     */
    public Databasechangeloglock rename(String name) {
        return new Databasechangeloglock(name, null);
    }
}
