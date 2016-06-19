/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.daos;


import models.talentDB.tables.Tag;
import models.talentDB.tables.records.TagRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
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
public class TagDao extends DAOImpl<TagRecord, models.talentDB.tables.pojos.Tag, Integer> {

    /**
     * Create a new TagDao without any configuration
     */
    public TagDao() {
        super(Tag.TAG, models.talentDB.tables.pojos.Tag.class);
    }

    /**
     * Create a new TagDao with an attached configuration
     */
    public TagDao(Configuration configuration) {
        super(Tag.TAG, models.talentDB.tables.pojos.Tag.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.talentDB.tables.pojos.Tag object) {
        return object.getTagId();
    }

    /**
     * Fetch records that have <code>Tag_ID IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Tag> fetchByTagId(Integer... values) {
        return fetch(Tag.TAG.TAG_ID, values);
    }

    /**
     * Fetch a unique record that has <code>Tag_ID = value</code>
     */
    public models.talentDB.tables.pojos.Tag fetchOneByTagId(Integer value) {
        return fetchOne(Tag.TAG.TAG_ID, value);
    }

    /**
     * Fetch records that have <code>Name IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Tag> fetchByName(String... values) {
        return fetch(Tag.TAG.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>Name = value</code>
     */
    public models.talentDB.tables.pojos.Tag fetchOneByName(String value) {
        return fetchOne(Tag.TAG.NAME, value);
    }
}
