/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.records;


import models.talentDB.tables.User;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;


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
@Table(name = "User", schema = "talent")
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record13<Integer, String, String, String, String, Date, String, String, String, String, String, Double, Double> {

    private static final long serialVersionUID = 407015789;

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer userId, String nickname, String username, String password, String email, Date dateOfBirth, String bio, String profilePicture, String facebook, String youtube, String profileLink, Double lat, Double lang) {
        super(User.USER);

        set(0, userId);
        set(1, nickname);
        set(2, username);
        set(3, password);
        set(4, email);
        set(5, dateOfBirth);
        set(6, bio);
        set(7, profilePicture);
        set(8, facebook);
        set(9, youtube);
        set(10, profileLink);
        set(11, lat);
        set(12, lang);
    }

    /**
     * Getter for <code>talent.User.User_ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talent.User.User_ID</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talent.User.Nickname</code>.
     */
    @Column(name = "Nickname", nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getNickname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>talent.User.Nickname</code>.
     */
    public void setNickname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>talent.User.Username</code>.
     */
    @Column(name = "Username", unique = true, nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>talent.User.Username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>talent.User.Password</code>.
     */
    @Column(name = "Password", nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>talent.User.Password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>talent.User.Email</code>.
     */
    @Column(name = "Email", unique = true, nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>talent.User.Email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>talent.User.Date_Of_Birth</code>.
     */
    @Column(name = "Date_Of_Birth")
    public Date getDateOfBirth() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>talent.User.Date_Of_Birth</code>.
     */
    public void setDateOfBirth(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>talent.User.Bio</code>.
     */
    @Column(name = "Bio", length = 255)
    @Size(max = 255)
    public String getBio() {
        return (String) get(6);
    }

    /**
     * Setter for <code>talent.User.Bio</code>.
     */
    public void setBio(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>talent.User.Profile_Picture</code>.
     */
    @Column(name = "Profile_Picture", length = 500)
    @Size(max = 500)
    public String getProfilePicture() {
        return (String) get(7);
    }

    /**
     * Setter for <code>talent.User.Profile_Picture</code>.
     */
    public void setProfilePicture(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>talent.User.Facebook</code>.
     */
    @Column(name = "Facebook", length = 255)
    @Size(max = 255)
    public String getFacebook() {
        return (String) get(8);
    }

    /**
     * Setter for <code>talent.User.Facebook</code>.
     */
    public void setFacebook(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>talent.User.Youtube</code>.
     */
    @Column(name = "Youtube", length = 255)
    @Size(max = 255)
    public String getYoutube() {
        return (String) get(9);
    }

    /**
     * Setter for <code>talent.User.Youtube</code>.
     */
    public void setYoutube(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>talent.User.Profile_Link</code>.
     */
    @Column(name = "Profile_Link", unique = true, length = 255)
    @Size(max = 255)
    public String getProfileLink() {
        return (String) get(10);
    }

    /**
     * Setter for <code>talent.User.Profile_Link</code>.
     */
    public void setProfileLink(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>talent.User.lat</code>.
     */
    @Column(name = "lat", precision = 22)
    public Double getLat() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>talent.User.lat</code>.
     */
    public void setLat(Double value) {
        set(11, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>talent.User.lang</code>.
     */
    @Column(name = "lang", precision = 22)
    public Double getLang() {
        return (Double) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>talent.User.lang</code>.
     */
    public void setLang(Double value) {
        set(12, value);
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
    public Row13<Integer, String, String, String, String, Date, String, String, String, String, String, Double, Double> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, Date, String, String, String, String, String, Double, Double> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return User.USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return User.USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return User.USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return User.USER.DATE_OF_BIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return User.USER.BIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return User.USER.PROFILE_PICTURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return User.USER.FACEBOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return User.USER.YOUTUBE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return User.USER.PROFILE_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return User.USER.LAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field13() {
        return User.USER.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getDateOfBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProfilePicture();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFacebook();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getYoutube();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getProfileLink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getLat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value13() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(Date value) {
        setDateOfBirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(String value) {
        setBio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value8(String value) {
        setProfilePicture(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value9(String value) {
        setFacebook(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value10(String value) {
        setYoutube(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value11(String value) {
        setProfileLink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value12(Double value) {
        setLat(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value13(Double value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, String value5, Date value6, String value7, String value8, String value9, String value10, String value11, Double value12, Double value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }
}
