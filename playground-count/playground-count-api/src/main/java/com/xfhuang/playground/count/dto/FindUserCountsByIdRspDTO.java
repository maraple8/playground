package com.xfhuang.playground.count.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserCountsByIdRspDTO {

    
    private Long userId;

    
    private Long fansTotal;

    
    private Long followingTotal;

    
    private Long noteTotal;

    
    private Long likeTotal;

    
    private Long collectTotal;
}
