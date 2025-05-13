package com.xfhuang.playground.note.biz.service;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.note.biz.model.vo.*;


public interface NoteService {

    
    Response<?> publishNote(PublishNoteReqVO publishNoteReqVO);

    
    Response<FindNoteDetailRspVO> findNoteDetail(FindNoteDetailReqVO findNoteDetailReqVO);

    
    Response<?> updateNote(UpdateNoteReqVO updateNoteReqVO);

    
    void deleteNoteLocalCache(Long noteId);

    
    Response<?> deleteNote(DeleteNoteReqVO deleteNoteReqVO);

    
    Response<?> visibleOnlyMe(UpdateNoteVisibleOnlyMeReqVO updateNoteVisibleOnlyMeReqVO);

    
    Response<?> topNote(TopNoteReqVO topNoteReqVO);

    
    Response<?> likeNote(LikeNoteReqVO likeNoteReqVO);

    
    Response<?> unlikeNote(UnlikeNoteReqVO unlikeNoteReqVO);

    
    Response<?> collectNote(CollectNoteReqVO collectNoteReqVO);

    
    Response<?> unCollectNote(UnCollectNoteReqVO unCollectNoteReqVO);

    
    Response<FindNoteIsLikedAndCollectedRspVO> isLikedAndCollectedData(FindNoteIsLikedAndCollectedReqVO findNoteIsLikedAndCollectedReqVO);

    
    Response<FindPublishedNoteListRspVO> findPublishedNoteList(FindPublishedNoteListReqVO findPublishedNoteListReqVO);

}
