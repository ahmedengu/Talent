/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Comment", schema = "talent")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1569844408;

    private Integer notificationId;
    private Integer postId;
    private String  text;

    public Comment() {}

    public Comment(Comment value) {
        this.notificationId = value.notificationId;
        this.postId = value.postId;
        this.text = value.text;
    }

    public Comment(
        Integer notificationId,
        Integer postId,
        String  text
    ) {
        this.notificationId = notificationId;
        this.postId = postId;
        this.text = text;
    }

    @Id
    @Column(name = "Notification_ID", unique = true, nullable = false, precision = 10)
    public Integer getNotificationId() {
        return this.notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    @Column(name = "Post_ID", nullable = false, precision = 10)
    @NotNull
    public Integer getPostId() {
        return this.postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Column(name = "Text", nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Comment (");

        sb.append(notificationId);
        sb.append(", ").append(postId);
        sb.append(", ").append(text);

        sb.append(")");
        return sb.toString();
    }
}
