package com.example.bookMyshow.Converter;

import com.example.bookMyshow.DTO.ShowDto;
import com.example.bookMyshow.Model.ShowEntity;

public class ShowConverter {
    public static ShowEntity DtoToEntity(ShowDto showDto){
        return ShowEntity.builder().id(showDto.getId()).showDate(showDto.getShowDate())
                .showTime(showDto.getShowTime()).build() ;
    }

    //entity to Dto converter
    public static ShowDto EntityToDto(ShowEntity showEntity){
        ShowDto showDto = ShowDto.builder().id(showEntity.getId()).showDate(showEntity.getShowDate())
                .showTime(showEntity.getShowTime()).;
        return showDto ;
    }
}
