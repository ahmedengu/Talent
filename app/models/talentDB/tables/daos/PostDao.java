/**
 * This class is generated by jOOQ
 */
package models.talentDB.tables.daos;


import models.talentDB.tables.Post;
import models.talentDB.tables.records.PostRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.List;


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
public class PostDao extends DAOImpl<PostRecord, models.talentDB.tables.pojos.Post, Integer> {

    /**
     * Create a new PostDao without any configuration
     */
    public PostDao() {
        super(Post.POST, models.talentDB.tables.pojos.Post.class);
    }

    /**
     * Create a new PostDao with an attached configuration
     */
    public PostDao(Configuration configuration) {
        super(Post.POST, models.talentDB.tables.pojos.Post.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.talentDB.tables.pojos.Post object) {
        return object.getPostId();
    }

    /**
     * Fetch records that have <code>Post_ID IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Post> fetchByPostId(Integer... values) {
        return fetch(Post.POST.POST_ID, values);
    }

    /**
     * Fetch a unique record that has <code>Post_ID = value</code>
     */
    public models.talentDB.tables.pojos.Post fetchOneByPostId(Integer value) {
        return fetchOne(Post.POST.POST_ID, value);
    }

    /**
     * Fetch records that have <code>User_ID IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Post> fetchByUserId(Integer... values) {
        return fetch(Post.POST.USER_ID, values);
    }

    /**
     * Fetch records that have <code>Category_ID IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Post> fetchByCategoryId(Integer... values) {
        return fetch(Post.POST.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>Total_Rating IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Post> fetchByTotalRating(Double... values) {
        return fetch(Post.POST.TOTAL_RATING, values);
    }

    /**
     * Fetch records that have <code>Date IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Post> fetchByDate(Timestamp... values) {
        return fetch(Post.POST.DATE, values);
    }

    /**
     * Fetch records that have <code>PostUrl IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Post> fetchByPosturl(String... values) {
        return fetch(Post.POST.POSTURL, values);
    }

    /**
     * Fetch records that have <code>RatingCount IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Post> fetchByRatingcount(Integer... values) {
        return fetch(Post.POST.RATINGCOUNT, values);
    }

    /**
     * Fetch records that have <code>tags IN (values)</code>
     */
    public List<models.talentDB.tables.pojos.Post> fetchByTags(String... values) {
        return fetch(Post.POST.TAGS, values);
    }
}
