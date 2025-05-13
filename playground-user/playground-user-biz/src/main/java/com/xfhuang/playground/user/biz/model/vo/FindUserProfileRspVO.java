package com.xfhuang.playground.user.biz.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserProfileRspVO {


    private Long userId;


    private String avatar;


    private String nickname;


    private String playgroundId;


    private Integer sex;


    private Integer age;


    private String introduction;


    private String followingTotal;


    private String fansTotal;


    private String likeAndCollectTotal;


    private String noteTotal;


    private String likeTotal;


    private String collectTotal;

}
