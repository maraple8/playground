package com.xfhuang.playground.user.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserByIdRspDTO {

    
    private Long id;

    
    private String nickName;

    
    private String avatar;

    
    private String introduction;
}
