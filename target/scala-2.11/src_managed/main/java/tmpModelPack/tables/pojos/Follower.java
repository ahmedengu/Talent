/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables.pojos;


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
@Table(name = "Follower", schema = "talent")
public class Follower implements Serializable {

    private static final long serialVersionUID = 1096743665;

    private Integer notificationId;
    private Integer userId;

    public Follower() {}

    public Follower(Follower value) {
        this.notificationId = value.notificationId;
        this.userId = value.userId;
    }

    public Follower(
        Integer notificationId,
        Integer userId
    ) {
        this.notificationId = notificationId;
        this.userId = userId;
    }

    @Id
    @Column(name = "Notification_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getNotificationId() {
        return this.notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    @Column(name = "User_ID", nullable = false, precision = 10)
    @NotNull
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Follower (");

        sb.append(notificationId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}
