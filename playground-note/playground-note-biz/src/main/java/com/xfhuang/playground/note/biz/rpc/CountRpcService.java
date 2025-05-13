package com.xfhuang.playground.note.biz.rpc;

import cn.hutool.core.collection.CollUtil;
import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.count.api.CountFeignApi;
import com.xfhuang.playground.count.dto.FindNoteCountsByIdRspDTO;
import com.xfhuang.playground.count.dto.FindNoteCountsByIdsReqDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;


@Component
public class CountRpcService {

    @Resource
    private CountFeignApi countFeignApi;

    
    public List<FindNoteCountsByIdRspDTO> findByNoteIds(List<Long> noteIds) {
        FindNoteCountsByIdsReqDTO findNoteCountsByIdsReqDTO = new FindNoteCountsByIdsReqDTO();
        findNoteCountsByIdsReqDTO.setNoteIds(noteIds);

        Response<List<FindNoteCountsByIdRspDTO>> response = countFeignApi.findNotesCount(findNoteCountsByIdsReqDTO);

        if (!response.isSuccess() || Objects.isNull(response.getData()) || CollUtil.isEmpty(response.getData())) {
            return null;
        }

        return response.getData();
    }

}
