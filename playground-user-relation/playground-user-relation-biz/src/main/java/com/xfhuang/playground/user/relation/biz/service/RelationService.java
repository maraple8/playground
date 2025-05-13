package com.xfhuang.playground.user.relation.biz.service;

import com.xfhuang.framework.common.response.PageResponse;
import com.xfhuang.framework.common.response.Response;
import com.xfhuang.playground.user.relation.biz.model.vo.*;



public interface RelationService {

    
    Response<?> follow(FollowUserReqVO followUserReqVO);

    
    Response<?> unfollow(UnfollowUserReqVO unfollowUserReqVO);

    
    PageResponse<FindFollowingUserRspVO> findFollowingList(FindFollowingListReqVO findFollowingListReqVO);

    
    PageResponse<FindFansUserRspVO> findFansList(FindFansListReqVO findFansListReqVO);
}
