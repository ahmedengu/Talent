/**
 * This class is generated by jOOQ
 */
package models.talentDB;


import models.talentDB.tables.*;
import models.talentDB.tables.records.*;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships between tables of the <code>talent</code>
 * schema
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.0"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CategoryRecord, Integer> IDENTITY_CATEGORY = Identities0.IDENTITY_CATEGORY;
    public static final Identity<CommentRecord, Integer> IDENTITY_COMMENT = Identities0.IDENTITY_COMMENT;
    public static final Identity<FollowerRecord, Integer> IDENTITY_FOLLOWER = Identities0.IDENTITY_FOLLOWER;
    public static final Identity<LikeRecord, Integer> IDENTITY_LIKE = Identities0.IDENTITY_LIKE;
    public static final Identity<NotificationRecord, Integer> IDENTITY_NOTIFICATION = Identities0.IDENTITY_NOTIFICATION;
    public static final Identity<PostRecord, Integer> IDENTITY_POST = Identities0.IDENTITY_POST;
    public static final Identity<RateRecord, Integer> IDENTITY_RATE = Identities0.IDENTITY_RATE;
    public static final Identity<TagRecord, Integer> IDENTITY_TAG = Identities0.IDENTITY_TAG;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = UniqueKeys0.KEY_CATEGORY_PRIMARY;
    public static final UniqueKey<CategoryRecord> KEY_CATEGORY_NAME = UniqueKeys0.KEY_CATEGORY_NAME;
    public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = UniqueKeys0.KEY_COMMENT_PRIMARY;
    public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = UniqueKeys0.KEY_DATABASECHANGELOGLOCK_PRIMARY;
    public static final UniqueKey<FollowerRecord> KEY_FOLLOWER_PRIMARY = UniqueKeys0.KEY_FOLLOWER_PRIMARY;
    public static final UniqueKey<LikeRecord> KEY_LIKE_PRIMARY = UniqueKeys0.KEY_LIKE_PRIMARY;
    public static final UniqueKey<NotificationRecord> KEY_NOTIFICATION_PRIMARY = UniqueKeys0.KEY_NOTIFICATION_PRIMARY;
    public static final UniqueKey<PostRecord> KEY_POST_PRIMARY = UniqueKeys0.KEY_POST_PRIMARY;
    public static final UniqueKey<PostTagRecord> KEY_POST_TAG_PRIMARY = UniqueKeys0.KEY_POST_TAG_PRIMARY;
    public static final UniqueKey<RateRecord> KEY_RATE_PRIMARY = UniqueKeys0.KEY_RATE_PRIMARY;
    public static final UniqueKey<TagRecord> KEY_TAG_PRIMARY = UniqueKeys0.KEY_TAG_PRIMARY;
    public static final UniqueKey<TagRecord> KEY_TAG_NAME = UniqueKeys0.KEY_TAG_NAME;
    public static final UniqueKey<TopRatedRecord> KEY_TOP_RATED_PRIMARY = UniqueKeys0.KEY_TOP_RATED_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_USERNAME = UniqueKeys0.KEY_USER_USERNAME;
    public static final UniqueKey<UserRecord> KEY_USER_EMAIL = UniqueKeys0.KEY_USER_EMAIL;
    public static final UniqueKey<UserRecord> KEY_USER_PROFILE_LINK = UniqueKeys0.KEY_USER_PROFILE_LINK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CategoryRecord, Integer> IDENTITY_CATEGORY = createIdentity(Category.CATEGORY, Category.CATEGORY.CATEGORY_ID);
        public static Identity<CommentRecord, Integer> IDENTITY_COMMENT = createIdentity(Comment.COMMENT, Comment.COMMENT.COMMENT_ID);
        public static Identity<FollowerRecord, Integer> IDENTITY_FOLLOWER = createIdentity(Follower.FOLLOWER, Follower.FOLLOWER.FOLLOWER_ID);
        public static Identity<LikeRecord, Integer> IDENTITY_LIKE = createIdentity(Like.LIKE, Like.LIKE.LIKE_ID);
        public static Identity<NotificationRecord, Integer> IDENTITY_NOTIFICATION = createIdentity(Notification.NOTIFICATION, Notification.NOTIFICATION.NOTIFICATION_ID);
        public static Identity<PostRecord, Integer> IDENTITY_POST = createIdentity(Post.POST, Post.POST.POST_ID);
        public static Identity<RateRecord, Integer> IDENTITY_RATE = createIdentity(Rate.RATE, Rate.RATE.RATE_ID);
        public static Identity<TagRecord, Integer> IDENTITY_TAG = createIdentity(Tag.TAG, Tag.TAG.TAG_ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.USER_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = createUniqueKey(Category.CATEGORY, "KEY_Category_PRIMARY", Category.CATEGORY.CATEGORY_ID);
        public static final UniqueKey<CategoryRecord> KEY_CATEGORY_NAME = createUniqueKey(Category.CATEGORY, "KEY_Category_Name", Category.CATEGORY.NAME);
        public static final UniqueKey<CommentRecord> KEY_COMMENT_PRIMARY = createUniqueKey(Comment.COMMENT, "KEY_Comment_PRIMARY", Comment.COMMENT.COMMENT_ID);
        public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, "KEY_DATABASECHANGELOGLOCK_PRIMARY", Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
        public static final UniqueKey<FollowerRecord> KEY_FOLLOWER_PRIMARY = createUniqueKey(Follower.FOLLOWER, "KEY_Follower_PRIMARY", Follower.FOLLOWER.FOLLOWER_ID);
        public static final UniqueKey<LikeRecord> KEY_LIKE_PRIMARY = createUniqueKey(Like.LIKE, "KEY_Like_PRIMARY", Like.LIKE.LIKE_ID);
        public static final UniqueKey<NotificationRecord> KEY_NOTIFICATION_PRIMARY = createUniqueKey(Notification.NOTIFICATION, "KEY_Notification_PRIMARY", Notification.NOTIFICATION.NOTIFICATION_ID);
        public static final UniqueKey<PostRecord> KEY_POST_PRIMARY = createUniqueKey(Post.POST, "KEY_Post_PRIMARY", Post.POST.POST_ID);
        public static final UniqueKey<PostTagRecord> KEY_POST_TAG_PRIMARY = createUniqueKey(PostTag.POST_TAG, "KEY_Post Tag_PRIMARY", PostTag.POST_TAG.TAG_ID, PostTag.POST_TAG.POST_ID);
        public static final UniqueKey<RateRecord> KEY_RATE_PRIMARY = createUniqueKey(Rate.RATE, "KEY_Rate_PRIMARY", Rate.RATE.RATE_ID);
        public static final UniqueKey<TagRecord> KEY_TAG_PRIMARY = createUniqueKey(Tag.TAG, "KEY_Tag_PRIMARY", Tag.TAG.TAG_ID);
        public static final UniqueKey<TagRecord> KEY_TAG_NAME = createUniqueKey(Tag.TAG, "KEY_Tag_Name", Tag.TAG.NAME);
        public static final UniqueKey<TopRatedRecord> KEY_TOP_RATED_PRIMARY = createUniqueKey(TopRated.TOP_RATED, "KEY_Top Rated_PRIMARY", TopRated.TOP_RATED.USER_ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_User_PRIMARY", User.USER.USER_ID);
        public static final UniqueKey<UserRecord> KEY_USER_USERNAME = createUniqueKey(User.USER, "KEY_User_Username", User.USER.USERNAME);
        public static final UniqueKey<UserRecord> KEY_USER_EMAIL = createUniqueKey(User.USER, "KEY_User_Email", User.USER.EMAIL);
        public static final UniqueKey<UserRecord> KEY_USER_PROFILE_LINK = createUniqueKey(User.USER, "KEY_User_Profile_Link", User.USER.PROFILE_LINK);
    }
}
