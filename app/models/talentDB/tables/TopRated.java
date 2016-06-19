/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables;


import models.talentDB.Keys;
import models.talentDB.Talent;
import models.talentDB.tables.records.TopRatedRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Date;
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
public class TopRated extends TableImpl<TopRatedRecord> {

    /**
     * The reference instance of <code>talent.Top Rated</code>
     */
    public static final TopRated TOP_RATED = new TopRated();
    private static final long serialVersionUID = 416888182;
    /**
     * The column <code>talent.Top Rated.User_ID</code>.
     */
    public final TableField<TopRatedRecord, Integer> USER_ID = createField("User_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.Top Rated.Category_ID</code>.
     */
    public final TableField<TopRatedRecord, Integer> CATEGORY_ID = createField("Category_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.Top Rated.Start_Date</code>.
     */
    public final TableField<TopRatedRecord, Date> START_DATE = createField("Start_Date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");
    /**
     * The column <code>talent.Top Rated.End_Date</code>.
     */
    public final TableField<TopRatedRecord, Date> END_DATE = createField("End_Date", org.jooq.impl.SQLDataType.DATE, this, "");
    /**
     * The column <code>talent.Top Rated.Category_Rating</code>.
     */
    public final TableField<TopRatedRecord, Double> CATEGORY_RATING = createField("Category_Rating", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * Create a <code>talent.Top Rated</code> table reference
     */
    public TopRated() {
        this("Top Rated", null);
    }

    /**
     * Create an aliased <code>talent.Top Rated</code> table reference
     */
    public TopRated(String alias) {
        this(alias, TOP_RATED);
    }

    private TopRated(String alias, Table<TopRatedRecord> aliased) {
        this(alias, aliased, null);
    }

    private TopRated(String alias, Table<TopRatedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TopRatedRecord> getRecordType() {
        return TopRatedRecord.class;
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
    public UniqueKey<TopRatedRecord> getPrimaryKey() {
        return Keys.KEY_TOP_RATED_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TopRatedRecord>> getKeys() {
        return Arrays.<UniqueKey<TopRatedRecord>>asList(Keys.KEY_TOP_RATED_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TopRated as(String alias) {
        return new TopRated(alias, this);
    }

    /**
     * Rename this table
     */
    public TopRated rename(String name) {
        return new TopRated(name, null);
    }
}
