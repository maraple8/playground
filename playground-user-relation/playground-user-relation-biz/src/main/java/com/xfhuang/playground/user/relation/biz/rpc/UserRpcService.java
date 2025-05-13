package com.xfhuang.playground.user.relation.biz.rpc;

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

        if (!response.isSuccess() || Objects.isNull(response.getData())) {
            return null;
        }

        return response.getData();
    }


    public List<FindUserByIdRspDTO> findByIds(List<Long> userIds) {
        FindUsersByIdsReqDTO findUsersByIdsReqDTO = new FindUsersByIdsReqDTO();
        findUsersByIdsReqDTO.setIds(userIds);

        Response<List<FindUserByIdRspDTO>> response = userFeignApi.findByIds(findUsersByIdsReqDTO);

        if (!response.isSuccess() || Objects.isNull(response.getData()) || CollUtil.isEmpty(response.getData())) {
            return null;
        }

        return response.getData();
    }


}
