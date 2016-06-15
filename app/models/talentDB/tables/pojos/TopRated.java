/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

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
@Table(name = "Top Rated", schema = "talent")
public class TopRated implements Serializable {

    private static final long serialVersionUID = -939653672;

    private Integer userId;
    private Integer categoryId;
    private Date    startDate;
    private Date    endDate;
    private Double  categoryRating;

    public TopRated() {}

    public TopRated(TopRated value) {
        this.userId = value.userId;
        this.categoryId = value.categoryId;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.categoryRating = value.categoryRating;
    }

    public TopRated(
        Integer userId,
        Integer categoryId,
        Date    startDate,
        Date    endDate,
        Double  categoryRating
    ) {
        this.userId = userId;
        this.categoryId = categoryId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.categoryRating = categoryRating;
    }

    @Id
    @Column(name = "User_ID", unique = true, nullable = false, precision = 10)
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "Category_ID", nullable = false, precision = 10)
    @NotNull
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "Start_Date", nullable = false)
    @NotNull
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "End_Date")
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "Category_Rating", nullable = false, precision = 12)
    @NotNull
    public Double getCategoryRating() {
        return this.categoryRating;
    }

    public void setCategoryRating(Double categoryRating) {
        this.categoryRating = categoryRating;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TopRated (");

        sb.append(userId);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(categoryRating);

        sb.append(")");
        return sb.toString();
    }
}