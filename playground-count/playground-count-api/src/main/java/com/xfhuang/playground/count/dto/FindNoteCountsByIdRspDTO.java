package com.xfhuang.playground.count.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindNoteCountsByIdRspDTO {


    private Long noteId;


    private Long likeTotal;


    private Long collectTotal;


    private Long commentTotal;

}
