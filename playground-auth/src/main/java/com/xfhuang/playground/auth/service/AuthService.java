package com.xfhuang.playground.auth.service;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.auth.model.vo.user.UpdatePasswordReqVO;
import com.xfhuang.playground.auth.model.vo.user.UserLoginReqVO;


public interface AuthService {


    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);


    Response<?> logout();


    Response<?> updatePassword(UpdatePasswordReqVO updatePasswordReqVO);
}
