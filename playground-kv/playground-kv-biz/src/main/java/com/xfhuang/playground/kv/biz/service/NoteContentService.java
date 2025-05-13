package com.xfhuang.playground.kv.biz.service;


import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.kv.dto.req.AddNoteContentReqDTO;
import com.xfhuang.playground.kv.dto.req.DeleteNoteContentReqDTO;
import com.xfhuang.playground.kv.dto.req.FindNoteContentReqDTO;
import com.xfhuang.playground.kv.dto.rsp.FindNoteContentRspDTO;


public interface NoteContentService {


    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);


    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);



    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);

}
