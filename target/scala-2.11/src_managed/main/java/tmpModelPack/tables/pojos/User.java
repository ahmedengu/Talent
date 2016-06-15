/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
@Entity
@Table(name = "User", schema = "talent")
public class User implements Serializable {

    private static final long serialVersionUID = -2017806783;

    private Integer userId;
    private String  nickname;
    private String  username;
    private String  password;
    private String  email;
    private Date    dateOfBirth;
    private String  bio;
    private byte[]  profilePicture;
    private String  facebook;
    private String  youtube;
    private byte[]  location;
    private String  profileLink;

    public User() {}

    public User(User value) {
        this.userId = value.userId;
        this.nickname = value.nickname;
        this.username = value.username;
        this.password = value.password;
        this.email = value.email;
        this.dateOfBirth = value.dateOfBirth;
        this.bio = value.bio;
        this.profilePicture = value.profilePicture;
        this.facebook = value.facebook;
        this.youtube = value.youtube;
        this.location = value.location;
        this.profileLink = value.profileLink;
    }

    public User(
        Integer userId,
        String  nickname,
        String  username,
        String  password,
        String  email,
        Date    dateOfBirth,
        String  bio,
        byte[]  profilePicture,
        String  facebook,
        String  youtube,
        byte[]  location,
        String  profileLink
    ) {
        this.userId = userId;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.bio = bio;
        this.profilePicture = profilePicture;
        this.facebook = facebook;
        this.youtube = youtube;
        this.location = location;
        this.profileLink = profileLink;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "Nickname", unique = true, nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "Username", unique = true, nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "Password", nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "Email", nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "Date_Of_Birth", nullable = false)
    @NotNull
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Column(name = "Bio", length = 255)
    @Size(max = 255)
    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Column(name = "Profile_Picture", length = 65535)
    public byte[] getProfilePicture() {
        return this.profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Column(name = "Facebook", length = 255)
    @Size(max = 255)
    public String getFacebook() {
        return this.facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Column(name = "Youtube", length = 255)
    @Size(max = 255)
    public String getYoutube() {
        return this.youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    @Column(name = "Location", length = 65535)
    public byte[] getLocation() {
        return this.location;
    }

    public void setLocation(byte[] location) {
        this.location = location;
    }

    @Column(name = "Profile_Link", unique = true, nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getProfileLink() {
        return this.profileLink;
    }

    public void setProfileLink(String profileLink) {
        this.profileLink = profileLink;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(userId);
        sb.append(", ").append(nickname);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(email);
        sb.append(", ").append(dateOfBirth);
        sb.append(", ").append(bio);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(facebook);
        sb.append(", ").append(youtube);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(profileLink);

        sb.append(")");
        return sb.toString();
    }
}