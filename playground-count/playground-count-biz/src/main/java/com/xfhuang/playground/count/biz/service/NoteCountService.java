package com.xfhuang.playground.count.biz.service;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.count.dto.FindNoteCountsByIdRspDTO;
import com.xfhuang.playground.count.dto.FindNoteCountsByIdsReqDTO;

import java.util.List;


public interface NoteCountService {


    Response<List<FindNoteCountsByIdRspDTO>> findNotesCountData(FindNoteCountsByIdsReqDTO findNoteCountsByIdsReqDTO);
}
