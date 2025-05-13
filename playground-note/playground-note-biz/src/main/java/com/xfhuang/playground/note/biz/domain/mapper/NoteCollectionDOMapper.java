package com.xfhuang.playground.note.biz.domain.mapper;

import com.xfhuang.playground.note.biz.domain.dataobject.NoteCollectionDO;
import com.xfhuang.playground.note.biz.domain.dataobject.NoteLikeDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoteCollectionDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NoteCollectionDO record);

    int insertSelective(NoteCollectionDO record);


    int insertOrUpdate(NoteCollectionDO noteCollectionDO);

    NoteCollectionDO selectByPrimaryKey(Long id);


    int selectCountByUserIdAndNoteId(@Param("userId") Long userId, @Param("noteId") Long noteId);


    List<NoteCollectionDO> selectByUserId(Long userId);


    int selectNoteIsCollected(@Param("userId") Long userId, @Param("noteId") Long noteId);


    List<NoteCollectionDO> selectCollectedByUserIdAndLimit(@Param("userId") Long userId, @Param("limit")  int limit);

    int updateByPrimaryKeySelective(NoteCollectionDO record);

    int updateByPrimaryKey(NoteCollectionDO record);


    int update2UnCollectByUserIdAndNoteId(NoteCollectionDO noteCollectionDO);

}