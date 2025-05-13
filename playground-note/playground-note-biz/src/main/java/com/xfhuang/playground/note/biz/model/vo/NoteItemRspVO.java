package com.xfhuang.playground.note.biz.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteItemRspVO {

    
    private Long noteId;

    
    private Integer type;

    
    private String cover;

    
    private String videoUri;

    
    private String title;

    
    private Long creatorId;

    
    private String nickname;

    
    private String avatar;

    
    private String likeTotal;

    
    private Boolean isLiked;

}
