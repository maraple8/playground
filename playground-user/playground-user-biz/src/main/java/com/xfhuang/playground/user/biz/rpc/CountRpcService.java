package com.xfhuang.playground.user.biz.rpc;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.count.api.CountFeignApi;
import com.xfhuang.playground.count.dto.FindUserCountsByIdReqDTO;
import com.xfhuang.playground.count.dto.FindUserCountsByIdRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class CountRpcService {

    @Resource
    private CountFeignApi countFeignApi;

    
    public FindUserCountsByIdRspDTO findUserCountById(Long userId) {
        FindUserCountsByIdReqDTO findUserCountsByIdReqDTO = new FindUserCountsByIdReqDTO();
        findUserCountsByIdReqDTO.setUserId(userId);

        Response<FindUserCountsByIdRspDTO> response = countFeignApi.findUserCount(findUserCountsByIdReqDTO);

        if (Objects.isNull(response) || !response.isSuccess()) {
            return null;
        }

        return response.getData();
    }

}
