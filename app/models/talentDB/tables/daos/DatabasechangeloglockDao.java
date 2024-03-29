/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.daos;


import models.talentDB.tables.Databasechangeloglock;
import models.talentDB.tables.records.DatabasechangeloglockRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
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
public class DatabasechangeloglockDao extends DAOImpl<DatabasechangeloglockRecord, models.talentDB.tables.pojos.Databasechangeloglock, Integer> {

    /**
     * Create a new DatabasechangeloglockDao without any configuration
     */
    public DatabasechangeloglockDao() {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK, models.talentDB.tables.pojos.Databasechangeloglock.class);
    }

    /**
     * Create a new DatabasechangeloglockDao with an attached configuration
     */
    public DatabasechangeloglockDao(Configuration configuration) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK, models.talentDB.tables.pojos.Databasechangeloglock.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.talentDB.tables.pojos.Databasechangeloglock object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Databasechangeloglock> fetchById(Integer... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.talentDB.tables.pojos.Databasechangeloglock fetchOneById(Integer value) {
        return fetchOne(Databasechangeloglock.DATABASECHANGELOGLOCK.ID, value);
    }

    /**
     * Fetch records that have <code>LOCKED IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Databasechangeloglock> fetchByLocked(Boolean... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED, values);
    }

    /**
     * Fetch records that have <code>LOCKGRANTED IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Databasechangeloglock> fetchByLockgranted(Timestamp... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED, values);
    }

    /**
     * Fetch records that have <code>LOCKEDBY IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Databasechangeloglock> fetchByLockedby(String... values) {
        return fetch(Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY, values);
    }
}
