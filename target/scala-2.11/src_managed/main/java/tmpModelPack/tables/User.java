/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import tmpModelPack.Keys;
import tmpModelPack.Talent;
import tmpModelPack.tables.records.UserRecord;


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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 390387823;

    /**
     * The reference instance of <code>talent.User</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>talent.User.User_ID</code>.
     */
    public final TableField<UserRecord, Integer> USER_ID = createField("User_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>talent.User.Nickname</code>.
     */
    public final TableField<UserRecord, String> NICKNAME = createField("Nickname", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>talent.User.Username</code>.
     */
    public final TableField<UserRecord, String> USERNAME = createField("Username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>talent.User.Password</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField("Password", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>talent.User.Email</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField("Email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>talent.User.Date_Of_Birth</code>.
     */
    public final TableField<UserRecord, Date> DATE_OF_BIRTH = createField("Date_Of_Birth", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>talent.User.Bio</code>.
     */
    public final TableField<UserRecord, String> BIO = createField("Bio", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

    /**
     * The column <code>talent.User.Profile_Picture</code>.
     */
    public final TableField<UserRecord, byte[]> PROFILE_PICTURE = createField("Profile_Picture", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>talent.User.Facebook</code>.
     */
    public final TableField<UserRecord, String> FACEBOOK = createField("Facebook", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>talent.User.Youtube</code>.
     */
    public final TableField<UserRecord, String> YOUTUBE = createField("Youtube", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>talent.User.Location</code>.
     */
    public final TableField<UserRecord, byte[]> LOCATION = createField("Location", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>talent.User.Profile_Link</code>.
     */
    public final TableField<UserRecord, String> PROFILE_LINK = createField("Profile_Link", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>talent.User</code> table reference
     */
    public User() {
        this("User", null);
    }

    /**
     * Create an aliased <code>talent.User</code> table reference
     */
    public User(String alias) {
        this(alias, USER);
    }

    private User(String alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(String alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public Identity<UserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY, Keys.KEY_USER_NICKNAME, Keys.KEY_USER_USERNAME, Keys.KEY_USER_PROFILE_LINK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    public User rename(String name) {
        return new User(name, null);
    }
}
