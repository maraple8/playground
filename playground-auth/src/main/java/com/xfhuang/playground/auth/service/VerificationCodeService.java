package com.xfhuang.playground.auth.service;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.auth.model.vo.verificationcode.SendVerificationCodeReqVO;


public interface VerificationCodeService {

    
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}
