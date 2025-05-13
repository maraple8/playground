package com.xfhuang.playground.data.align.domain.mapper;

import org.apache.ibatis.annotations.Param;


public interface UpdateMapper {

    
    int updateUserFollowingTotalByUserId(@Param("userId") long userId,
                                         @Param("followingTotal") int followingTotal);

    
    int updateUserFansTotalByUserId(@Param("userId") long userId,
                                         @Param("fansTotal") int fansTotal);

    
    int updateUserLikeTotalByUserId(@Param("userId") long userId,
                                    @Param("likeTotal") int likeTotal);

    
    int updateUserCollectTotalByUserId(@Param("userId") long userId,
                                    @Param("collectTotal") int collectTotal);

    
    int updateUserNoteTotalByUserId(@Param("userId") long userId,
                                       @Param("noteTotal") int noteTotal);

    
    int updateNoteLikeTotalByUserId(@Param("noteId") long noteId,
                                         @Param("noteLikeTotal") int noteLikeTotal);

    
    int updateNoteCollectTotalByUserId(@Param("noteId") long noteId,
                                    @Param("noteCollectTotal") int noteCollectTotal);
}