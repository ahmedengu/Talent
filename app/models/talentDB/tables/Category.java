/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables;


import models.talentDB.Keys;
import models.talentDB.Talent;
import models.talentDB.tables.records.CategoryRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class Category extends TableImpl<CategoryRecord> {

    /**
     * The reference instance of <code>talent.Category</code>
     */
    public static final Category CATEGORY = new Category();
    private static final long serialVersionUID = 1320377998;
    /**
     * The column <code>talent.Category.Category_ID</code>.
     */
    public final TableField<CategoryRecord, Integer> CATEGORY_ID = createField("Category_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>talent.Category.Name</code>.
     */
    public final TableField<CategoryRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");
    /**
     * The column <code>talent.Category.Number_Of_Posts</code>.
     */
    public final TableField<CategoryRecord, Integer> NUMBER_OF_POSTS = createField("Number_Of_Posts", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>talent.Category</code> table reference
     */
    public Category() {
        this("Category", null);
    }

    /**
     * Create an aliased <code>talent.Category</code> table reference
     */
    public Category(String alias) {
        this(alias, CATEGORY);
    }

    private Category(String alias, Table<CategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Category(String alias, Table<CategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryRecord> getRecordType() {
        return CategoryRecord.class;
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
    public Identity<CategoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CategoryRecord> getPrimaryKey() {
        return Keys.KEY_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoryRecord>>asList(Keys.KEY_CATEGORY_PRIMARY, Keys.KEY_CATEGORY_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category as(String alias) {
        return new Category(alias, this);
    }

    /**
     * Rename this table
     */
    public Category rename(String name) {
        return new Category(name, null);
    }
}
