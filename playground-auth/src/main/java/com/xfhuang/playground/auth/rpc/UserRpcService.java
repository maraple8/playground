package com.xfhuang.playground.auth.rpc;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.user.api.UserFeignApi;
import com.xfhuang.playground.user.dto.req.FindUserByPhoneReqDTO;
import com.xfhuang.playground.user.dto.req.RegisterUserReqDTO;
import com.xfhuang.playground.user.dto.req.UpdateUserPasswordReqDTO;
import com.xfhuang.playground.user.dto.resp.FindUserByPhoneRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;


    public Long registerUser(String phone) {
        RegisterUserReqDTO registerUserReqDTO = new RegisterUserReqDTO();
        registerUserReqDTO.setPhone(phone);

        Response<Long> response = userFeignApi.registerUser(registerUserReqDTO);

        if (!response.isSuccess()) {
            return null;
        }

        return response.getData();
    }


    public FindUserByPhoneRspDTO findUserByPhone(String phone) {
        FindUserByPhoneReqDTO findUserByPhoneReqDTO = new FindUserByPhoneReqDTO();
        findUserByPhoneReqDTO.setPhone(phone);

        Response<FindUserByPhoneRspDTO> response = userFeignApi.findByPhone(findUserByPhoneReqDTO);

        if (!response.isSuccess()) {
            return null;
        }

        return response.getData();
    }


    public void updatePassword(String encodePassword) {
        UpdateUserPasswordReqDTO updateUserPasswordReqDTO = new UpdateUserPasswordReqDTO();
        updateUserPasswordReqDTO.setEncodePassword(encodePassword);

        userFeignApi.updatePassword(updateUserPasswordReqDTO);
    }

}
