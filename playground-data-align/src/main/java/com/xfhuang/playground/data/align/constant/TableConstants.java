package com.xfhuang.playground.data.align.constant;


public class TableConstants {

    
    private static final String TABLE_NAME_SEPARATE = "_";

    
    public static String buildTableNameSuffix(String date, long hashKey) {
        // 拼接完整的表名
        return date + TABLE_NAME_SEPARATE + hashKey;
    }

}
