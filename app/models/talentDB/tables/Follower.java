/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables;


import models.talentDB.Keys;
import models.talentDB.Talent;
import models.talentDB.tables.records.FollowerRecord;
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
public class Follower extends TableImpl<FollowerRecord> {

    /**
     * The reference instance of <code>talent.Follower</code>
     */
    public static final Follower FOLLOWER = new Follower();
    private static final long serialVersionUID = 781122129;
    /**
     * The column <code>talent.Follower.Follower_ID</code>.
     */
    public final TableField<FollowerRecord, Integer> FOLLOWER_ID = createField("Follower_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.Follower.Date</code>.
     */
    public final TableField<FollowerRecord, Timestamp> DATE = createField("Date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");
    /**
     * The column <code>talent.Follower.Followed</code>.
     */
    public final TableField<FollowerRecord, Integer> FOLLOWED = createField("Followed", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.Follower.Follower</code>.
     */
    public final TableField<FollowerRecord, Integer> FOLLOWER_ = createField("Follower", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>talent.Follower</code> table reference
     */
    public Follower() {
        this("Follower", null);
    }

    /**
     * Create an aliased <code>talent.Follower</code> table reference
     */
    public Follower(String alias) {
        this(alias, FOLLOWER);
    }

    private Follower(String alias, Table<FollowerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Follower(String alias, Table<FollowerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FollowerRecord> getRecordType() {
        return FollowerRecord.class;
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
    public Identity<FollowerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FOLLOWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FollowerRecord> getPrimaryKey() {
        return Keys.KEY_FOLLOWER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FollowerRecord>> getKeys() {
        return Arrays.<UniqueKey<FollowerRecord>>asList(Keys.KEY_FOLLOWER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Follower as(String alias) {
        return new Follower(alias, this);
    }

    /**
     * Rename this table
     */
    public Follower rename(String name) {
        return new Follower(name, null);
    }
}
