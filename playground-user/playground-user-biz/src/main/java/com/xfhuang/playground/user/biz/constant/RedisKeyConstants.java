package com.xfhuang.playground.user.biz.constant;


public class RedisKeyConstants {

    
    private static final String USER_ROLES_KEY_PREFIX = "user:roles:";

    
    private static final String USER_INFO_KEY_PREFIX = "user:info:";

    
    private static final String ROLE_PERMISSIONS_KEY_PREFIX = "role:permissions:";

    
    private static final String USER_PROFILE_KEY_PREFIX = "user:profile:";

    
    public static String buildUserRoleKey(Long userId) {
        return USER_ROLES_KEY_PREFIX + userId;
    }

    
    public static String buildRolePermissionsKey(String roleKey) {
        return ROLE_PERMISSIONS_KEY_PREFIX + roleKey;
    }

    
    public static String buildUserInfoKey(Long userId) {
        return USER_INFO_KEY_PREFIX + userId;
    }

    
    public static String buildUserProfileKey(Long userId) {
        return USER_PROFILE_KEY_PREFIX + userId;
    }
}
