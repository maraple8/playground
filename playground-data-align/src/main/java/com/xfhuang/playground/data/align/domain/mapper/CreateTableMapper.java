package com.xfhuang.playground.data.align.domain.mapper;


public interface CreateTableMapper {


    void createDataAlignFollowingCountTempTable(String tableNameSuffix);


    void createDataAlignFansCountTempTable(String tableNameSuffix);


    void createDataAlignNoteCollectCountTempTable(String tableNameSuffix);


    void createDataAlignUserCollectCountTempTable(String tableNameSuffix);


    void createDataAlignUserLikeCountTempTable(String tableNameSuffix);


    void createDataAlignNoteLikeCountTempTable(String tableNameSuffix);


    void createDataAlignNotePublishCountTempTable(String tableNameSuffix);
}