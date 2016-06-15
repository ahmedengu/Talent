/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables.pojos;


import java.io.Serializable;

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
@Table(name = "Category", schema = "talent")
public class Category implements Serializable {

    private static final long serialVersionUID = -381941689;

    private Integer categoryId;
    private String  name;
    private Integer numberOfPosts;

    public Category() {}

    public Category(Category value) {
        this.categoryId = value.categoryId;
        this.name = value.name;
        this.numberOfPosts = value.numberOfPosts;
    }

    public Category(
        Integer categoryId,
        String  name,
        Integer numberOfPosts
    ) {
        this.categoryId = categoryId;
        this.name = name;
        this.numberOfPosts = numberOfPosts;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Category_ID", unique = true, nullable = false, precision = 10)
    @NotNull
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "Name", unique = true, nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Number_Of_Posts", nullable = false, precision = 10)
    @NotNull
    public Integer getNumberOfPosts() {
        return this.numberOfPosts;
    }

    public void setNumberOfPosts(Integer numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Category (");

        sb.append(categoryId);
        sb.append(", ").append(name);
        sb.append(", ").append(numberOfPosts);

        sb.append(")");
        return sb.toString();
    }
}
