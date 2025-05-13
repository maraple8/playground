package com.xfhuang.playground.auth.model.vo.user;

import com.xfhuang.framework.common.validator.PhoneNumber;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginReqVO {

    
    @NotBlank(message = "手机号不能为空")
    @PhoneNumber
    private String phone;

    
    private String code;

    
    private String password;

    
    @NotNull(message = "登录类型不能为空")
    private Integer type;
}
