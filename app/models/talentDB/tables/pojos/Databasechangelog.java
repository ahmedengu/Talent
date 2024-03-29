/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.pojos;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;


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
@Table(name = "DATABASECHANGELOG", schema = "talent")
public class Databasechangelog implements Serializable {

    private static final long serialVersionUID = -2100973582;

    private String id;
    private String author;
    private String filename;
    private Timestamp dateexecuted;
    private Integer orderexecuted;
    private String exectype;
    private String md5sum;
    private String description;
    private String comments;
    private String tag;
    private String liquibase;

    public Databasechangelog() {
    }

    public Databasechangelog(Databasechangelog value) {
        this.id = value.id;
        this.author = value.author;
        this.filename = value.filename;
        this.dateexecuted = value.dateexecuted;
        this.orderexecuted = value.orderexecuted;
        this.exectype = value.exectype;
        this.md5sum = value.md5sum;
        this.description = value.description;
        this.comments = value.comments;
        this.tag = value.tag;
        this.liquibase = value.liquibase;
    }

    public Databasechangelog(
            String id,
            String author,
            String filename,
            Timestamp dateexecuted,
            Integer orderexecuted,
            String exectype,
            String md5sum,
            String description,
            String comments,
            String tag,
            String liquibase
    ) {
        this.id = id;
        this.author = author;
        this.filename = filename;
        this.dateexecuted = dateexecuted;
        this.orderexecuted = orderexecuted;
        this.exectype = exectype;
        this.md5sum = md5sum;
        this.description = description;
        this.comments = comments;
        this.tag = tag;
        this.liquibase = liquibase;
    }

    @Column(name = "ID", nullable = false, length = 255)
    @Size(max = 255)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "AUTHOR", nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "FILENAME", nullable = false, length = 255)
    @NotNull
    @Size(max = 255)
    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Column(name = "DATEEXECUTED", nullable = false)
    @NotNull
    public Timestamp getDateexecuted() {
        return this.dateexecuted;
    }

    public void setDateexecuted(Timestamp dateexecuted) {
        this.dateexecuted = dateexecuted;
    }

    @Column(name = "ORDEREXECUTED", nullable = false, precision = 10)
    @NotNull
    public Integer getOrderexecuted() {
        return this.orderexecuted;
    }

    public void setOrderexecuted(Integer orderexecuted) {
        this.orderexecuted = orderexecuted;
    }

    @Column(name = "EXECTYPE", nullable = false, length = 10)
    @NotNull
    @Size(max = 10)
    public String getExectype() {
        return this.exectype;
    }

    public void setExectype(String exectype) {
        this.exectype = exectype;
    }

    @Column(name = "MD5SUM", length = 35)
    @Size(max = 35)
    public String getMd5sum() {
        return this.md5sum;
    }

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    @Column(name = "DESCRIPTION", length = 255)
    @Size(max = 255)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "COMMENTS", length = 255)
    @Size(max = 255)
    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Column(name = "TAG", length = 255)
    @Size(max = 255)
    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Column(name = "LIQUIBASE", length = 20)
    @Size(max = 20)
    public String getLiquibase() {
        return this.liquibase;
    }

    public void setLiquibase(String liquibase) {
        this.liquibase = liquibase;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Databasechangelog (");

        sb.append(id);
        sb.append(", ").append(author);
        sb.append(", ").append(filename);
        sb.append(", ").append(dateexecuted);
        sb.append(", ").append(orderexecuted);
        sb.append(", ").append(exectype);
        sb.append(", ").append(md5sum);
        sb.append(", ").append(description);
        sb.append(", ").append(comments);
        sb.append(", ").append(tag);
        sb.append(", ").append(liquibase);

        sb.append(")");
        return sb.toString();
    }
}
