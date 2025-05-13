package com.xfhuang.playground.user.relation.biz.constant;


public class RedisKeyConstants {

    
    private static final String USER_FOLLOWING_KEY_PREFIX = "following:";

    
    private static final String USER_FANS_KEY_PREFIX = "fans:";

    
    public static String buildUserFollowingKey(Long userId) {
        return USER_FOLLOWING_KEY_PREFIX + userId;
    }

    
    public static String buildUserFansKey(Long userId) {
        return USER_FANS_KEY_PREFIX + userId;
    }

}
