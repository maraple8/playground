package com.xfhuang.playground.user.biz.model.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserInfoReqVO {

    @NotNull(message = "用户 ID 不能为空")
    private Long userId;

    
    private MultipartFile avatar;

    
    private String nickname;

    
    private String playgroundId;

    
    private Integer sex;

    
    private LocalDate birthday;

    
    private String introduction;

    
    private MultipartFile backgroundImg;

}
