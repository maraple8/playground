package com.xfhuang.playground.data.align.domain.mapper;


public interface DeleteTableMapper {


    void deleteDataAlignFollowingCountTempTable(String tableNameSuffix);


    void deleteDataAlignFansCountTempTable(String tableNameSuffix);


    void deleteDataAlignNoteCollectCountTempTable(String tableNameSuffix);


    void deleteDataAlignUserCollectCountTempTable(String tableNameSuffix);


    void deleteDataAlignUserLikeCountTempTable(String tableNameSuffix);


    void deleteDataAlignNoteLikeCountTempTable(String tableNameSuffix);


    void deleteDataAlignNotePublishCountTempTable(String tableNameSuffix);
}