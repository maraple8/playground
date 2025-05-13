package com.xfhuang.playground.count.biz.service;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.count.dto.FindUserCountsByIdReqDTO;
import com.xfhuang.playground.count.dto.FindUserCountsByIdRspDTO;


public interface UserCountService {

    
    Response<FindUserCountsByIdRspDTO> findUserCountData(FindUserCountsByIdReqDTO findUserCountsByIdReqDTO);
}
