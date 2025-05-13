package com.xfhuang.playground.kv.biz.service;


import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.kv.dto.req.BatchAddCommentContentReqDTO;
import com.xfhuang.playground.kv.dto.req.BatchFindCommentContentReqDTO;
import com.xfhuang.playground.kv.dto.req.DeleteCommentContentReqDTO;


public interface CommentContentService {


    
    Response<?> batchAddCommentContent(BatchAddCommentContentReqDTO batchAddCommentContentReqDTO);

    
    Response<?> batchFindCommentContent(BatchFindCommentContentReqDTO batchFindCommentContentReqDTO);

    
    Response<?> deleteCommentContent(DeleteCommentContentReqDTO deleteCommentContentReqDTO);

}
