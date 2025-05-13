package com.xfhuang.playground.user.biz.service;

import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.user.biz.model.vo.FindUserProfileReqVO;
import com.xfhuang.playground.user.biz.model.vo.FindUserProfileRspVO;
import com.xfhuang.playground.user.biz.model.vo.UpdateUserInfoReqVO;
import com.xfhuang.playground.user.dto.req.*;
import com.xfhuang.playground.user.dto.resp.FindUserByIdRspDTO;
import com.xfhuang.playground.user.dto.resp.FindUserByPhoneRspDTO;

import java.util.List;


public interface UserService {


    Response<?> updateUserInfo(UpdateUserInfoReqVO updateUserInfoReqVO);


    Response<Long> register(RegisterUserReqDTO registerUserReqDTO);


    Response<FindUserByPhoneRspDTO> findByPhone(FindUserByPhoneReqDTO findUserByPhoneReqDTO);


    Response<?> updatePassword(UpdateUserPasswordReqDTO updateUserPasswordReqDTO);


    Response<FindUserByIdRspDTO> findById(FindUserByIdReqDTO findUserByIdReqDTO);


    Response<List<FindUserByIdRspDTO>> findByIds(FindUsersByIdsReqDTO findUsersByIdsReqDTO);


    Response<FindUserProfileRspVO> findUserProfile(FindUserProfileReqVO findUserProfileReqVO);

}
