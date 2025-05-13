package com.xfhuang.playground.count.api;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.count.constant.ApiConstants;
import com.xfhuang.playground.count.dto.FindNoteCountsByIdRspDTO;
import com.xfhuang.playground.count.dto.FindNoteCountsByIdsReqDTO;
import com.xfhuang.playground.count.dto.FindUserCountsByIdReqDTO;
import com.xfhuang.playground.count.dto.FindUserCountsByIdRspDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface CountFeignApi {

    String PREFIX = "/count";


    @PostMapping(value = PREFIX + "/user/data")
    Response<FindUserCountsByIdRspDTO> findUserCount(@RequestBody FindUserCountsByIdReqDTO findUserCountsByIdReqDTO);


    @PostMapping(value = PREFIX + "/notes/data")
    Response<List<FindNoteCountsByIdRspDTO>> findNotesCount(@RequestBody FindNoteCountsByIdsReqDTO findNoteCountsByIdsReqDTO);

}
