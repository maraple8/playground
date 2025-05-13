package com.xfhuang.playground.data.align.domain.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SelectMapper {


    
    List<Long> selectBatchFromDataAlignFollowingCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                               @Param("batchSize") int batchSize);

    
    int selectCountFromFollowingTableByUserId(long userId);

    
    List<Long> selectBatchFromDataAlignFansCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                               @Param("batchSize") int batchSize);

    
    int selectCountFromFansTableByUserId(long userId);

    
    List<Long> selectBatchFromDataAlignUserLikeCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                              @Param("batchSize") int batchSize);

    
    int selectUserLikeCountFromNoteLikeTableByUserId(long userId);

    
    List<Long> selectBatchFromDataAlignUserCollectCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                              @Param("batchSize") int batchSize);

    
    int selectUserCollectCountFromNoteCollectionTableByUserId(long userId);

    
    List<Long> selectBatchFromDataAlignNoteLikeCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                               @Param("batchSize") int batchSize);

    
    int selectCountFromNoteLikeTableByUserId(long noteId);

    
    List<Long> selectBatchFromDataAlignNotePublishCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                              @Param("batchSize") int batchSize);

    
    int selectCountFromNoteTableByUserId(long userId);

    
    List<Long> selectBatchFromDataAlignNoteCollectCountTempTable(@Param("tableNameSuffix") String tableNameSuffix,
                                                              @Param("batchSize") int batchSize);

    
    int selectCountFromNoteCollectionTableByUserId(long noteId);
}