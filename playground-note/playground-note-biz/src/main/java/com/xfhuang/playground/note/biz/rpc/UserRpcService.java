package com.xfhuang.playground.note.biz.rpc;

import cn.hutool.core.collection.CollUtil;
import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.user.api.UserFeignApi;
import com.xfhuang.playground.user.dto.req.FindUserByIdReqDTO;
import com.xfhuang.playground.user.dto.req.FindUsersByIdsReqDTO;
import com.xfhuang.playground.user.dto.resp.FindUserByIdRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;


@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;


    public FindUserByIdRspDTO findById(Long userId) {
        FindUserByIdReqDTO findUserByIdReqDTO = new FindUserByIdReqDTO();
        findUserByIdReqDTO.setId(userId);

        Response<FindUserByIdRspDTO> response = userFeignApi.findById(findUserByIdReqDTO);

        if (Objects.isNull(response) || !response.isSuccess()) {
            return null;
        }

        return response.getData();
    }



}
