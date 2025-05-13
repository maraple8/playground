package com.xfhuang.playground.note.biz.convert;

import com.xfhuang.playground.note.biz.domain.dataobject.NoteDO;
import com.xfhuang.playground.note.biz.model.dto.PublishNoteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface NoteConvert {

    
    NoteConvert INSTANCE = Mappers.getMapper(NoteConvert.class);

    
    PublishNoteDTO convertDO2DTO(NoteDO bean);

    
    NoteDO convertDTO2DO(PublishNoteDTO bean);
}
