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
@Table(name = "Rate", schema = "talent")
public class Rate implements Serializable {

    private static final long serialVersionUID = 1939831773;

    private Integer notificationId;
    private Integer postId;
    private Double  rating;

    public Rate() {}

    public Rate(Rate value) {
        this.notificationId = value.notificationId;
        this.postId = value.postId;
        this.rating = value.rating;
    }

    public Rate(
        Integer notificationId,
        Integer postId,
        Double  rating
    ) {
        this.notificationId = notificationId;
        this.postId = postId;
        this.rating = rating;
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

    @Column(name = "Rating", nullable = false, precision = 12)
    @NotNull
    public Double getRating() {
        return this.rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Rate (");

        sb.append(notificationId);
        sb.append(", ").append(postId);
        sb.append(", ").append(rating);

        sb.append(")");
        return sb.toString();
    }
}