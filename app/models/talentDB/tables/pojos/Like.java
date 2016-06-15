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
@Table(name = "Like", schema = "talent")
public class Like implements Serializable {

    private static final long serialVersionUID = 1031539682;

    private Integer notificationId;
    private Integer postId;

    public Like() {}

    public Like(Like value) {
        this.notificationId = value.notificationId;
        this.postId = value.postId;
    }

    public Like(
        Integer notificationId,
        Integer postId
    ) {
        this.notificationId = notificationId;
        this.postId = postId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Like (");

        sb.append(notificationId);
        sb.append(", ").append(postId);

        sb.append(")");
        return sb.toString();
    }
}
