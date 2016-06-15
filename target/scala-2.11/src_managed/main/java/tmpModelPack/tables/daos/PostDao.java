/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables.daos;


import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import tmpModelPack.tables.Post;
import tmpModelPack.tables.records.PostRecord;


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
public class PostDao extends DAOImpl<PostRecord, tmpModelPack.tables.pojos.Post, Integer> {

    /**
     * Create a new PostDao without any configuration
     */
    public PostDao() {
        super(Post.POST, tmpModelPack.tables.pojos.Post.class);
    }

    /**
     * Create a new PostDao with an attached configuration
     */
    public PostDao(Configuration configuration) {
        super(Post.POST, tmpModelPack.tables.pojos.Post.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(tmpModelPack.tables.pojos.Post object) {
        return object.getPostId();
    }

    /**
     * Fetch records that have <code>Post_ID IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Post> fetchByPostId(Integer... values) {
        return fetch(Post.POST.POST_ID, values);
    }

    /**
     * Fetch a unique record that has <code>Post_ID = value</code>
     */
    public tmpModelPack.tables.pojos.Post fetchOneByPostId(Integer value) {
        return fetchOne(Post.POST.POST_ID, value);
    }

    /**
     * Fetch records that have <code>User_ID IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Post> fetchByUserId(Integer... values) {
        return fetch(Post.POST.USER_ID, values);
    }

    /**
     * Fetch records that have <code>Category_ID IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Post> fetchByCategoryId(Integer... values) {
        return fetch(Post.POST.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>Total_Rating IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Post> fetchByTotalRating(Double... values) {
        return fetch(Post.POST.TOTAL_RATING, values);
    }

    /**
     * Fetch records that have <code>Date IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Post> fetchByDate(Date... values) {
        return fetch(Post.POST.DATE, values);
    }

    /**
     * Fetch records that have <code>Time IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Post> fetchByTime(Time... values) {
        return fetch(Post.POST.TIME, values);
    }
}
