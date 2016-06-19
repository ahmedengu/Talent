/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables;


import models.talentDB.Keys;
import models.talentDB.Talent;
import models.talentDB.tables.records.RateRecord;
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
public class Rate extends TableImpl<RateRecord> {

    /**
     * The reference instance of <code>talent.Rate</code>
     */
    public static final Rate RATE = new Rate();
    private static final long serialVersionUID = -274898256;
    /**
     * The column <code>talent.Rate.Rate_ID</code>.
     */
    public final TableField<RateRecord, Integer> RATE_ID = createField("Rate_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.Rate.Post_ID</code>.
     */
    public final TableField<RateRecord, Integer> POST_ID = createField("Post_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.Rate.Rating</code>.
     */
    public final TableField<RateRecord, Double> RATING = createField("Rating", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");
    /**
     * The column <code>talent.Rate.User_ID</code>.
     */
    public final TableField<RateRecord, Integer> USER_ID = createField("User_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.Rate.Date</code>.
     */
    public final TableField<RateRecord, Timestamp> DATE = createField("Date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>talent.Rate</code> table reference
     */
    public Rate() {
        this("Rate", null);
    }

    /**
     * Create an aliased <code>talent.Rate</code> table reference
     */
    public Rate(String alias) {
        this(alias, RATE);
    }

    private Rate(String alias, Table<RateRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rate(String alias, Table<RateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RateRecord> getRecordType() {
        return RateRecord.class;
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
    public Identity<RateRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RateRecord> getPrimaryKey() {
        return Keys.KEY_RATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RateRecord>> getKeys() {
        return Arrays.<UniqueKey<RateRecord>>asList(Keys.KEY_RATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rate as(String alias) {
        return new Rate(alias, this);
    }

    /**
     * Rename this table
     */
    public Rate rename(String name) {
        return new Rate(name, null);
    }
}
