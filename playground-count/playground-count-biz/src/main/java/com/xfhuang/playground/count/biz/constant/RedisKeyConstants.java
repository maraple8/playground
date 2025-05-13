package com.xfhuang.playground.count.biz.constant;


public class RedisKeyConstants {


    private static final String COUNT_USER_KEY_PREFIX = "count:user:";


    private static final String COUNT_NOTE_KEY_PREFIX = "count:note:";


    private static final String COUNT_COMMENT_KEY_PREFIX = "count:comment:";


    public static final String FIELD_LIKE_TOTAL = "likeTotal";


    public static final String FIELD_NOTE_TOTAL = "noteTotal";


    public static final String FIELD_COLLECT_TOTAL = "collectTotal";


    public static final String FIELD_COMMENT_TOTAL = "commentTotal";


    public static final String FIELD_FANS_TOTAL = "fansTotal";


    public static final String FIELD_FOLLOWING_TOTAL = "followingTotal";


    public static final String FIELD_CHILD_COMMENT_TOTAL = "childCommentTotal";



    public static String buildCountUserKey(Long userId) {
        return COUNT_USER_KEY_PREFIX + userId;
    }


    public static String buildCountNoteKey(Long noteId) {
        return COUNT_NOTE_KEY_PREFIX + noteId;
    }


    public static String buildCountCommentKey(Long commentId) {
        return COUNT_COMMENT_KEY_PREFIX + commentId;
    }


}
