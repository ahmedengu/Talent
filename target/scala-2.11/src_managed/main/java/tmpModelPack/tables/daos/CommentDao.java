/**
 * This class is generated by jOOQ
 */
package tmpModelPack.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import tmpModelPack.tables.Comment;
import tmpModelPack.tables.records.CommentRecord;


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
public class CommentDao extends DAOImpl<CommentRecord, tmpModelPack.tables.pojos.Comment, Integer> {

    /**
     * Create a new CommentDao without any configuration
     */
    public CommentDao() {
        super(Comment.COMMENT, tmpModelPack.tables.pojos.Comment.class);
    }

    /**
     * Create a new CommentDao with an attached configuration
     */
    public CommentDao(Configuration configuration) {
        super(Comment.COMMENT, tmpModelPack.tables.pojos.Comment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(tmpModelPack.tables.pojos.Comment object) {
        return object.getNotificationId();
    }

    /**
     * Fetch records that have <code>Notification_ID IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Comment> fetchByNotificationId(Integer... values) {
        return fetch(Comment.COMMENT.NOTIFICATION_ID, values);
    }

    /**
     * Fetch a unique record that has <code>Notification_ID = value</code>
     */
    public tmpModelPack.tables.pojos.Comment fetchOneByNotificationId(Integer value) {
        return fetchOne(Comment.COMMENT.NOTIFICATION_ID, value);
    }

    /**
     * Fetch records that have <code>Post_ID IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Comment> fetchByPostId(Integer... values) {
        return fetch(Comment.COMMENT.POST_ID, values);
    }

    /**
     * Fetch records that have <code>Text IN (values)</code>
     */
    public List<tmpModelPack.tables.pojos.Comment> fetchByText(String... values) {
        return fetch(Comment.COMMENT.TEXT, values);
    }
}