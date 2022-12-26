package com.example.bookMyshow.Converter;

import com.example.bookMyshow.DTO.TheatreDto;
import com.example.bookMyshow.Model.TheatreEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheatreConverter {
     public static TheatreEntity dtoToEntity(TheatreDto theatreDto){
         return TheatreEntity.builder().id(theatreDto.getId()).name(theatreDto.getName())
                 .city(theatreDto.getCity()).address(theatreDto.getAddress()).build() ;
     }

     public static TheatreDto EntityToDto(TheatreEntity theatreEntity){
         return TheatreDto.builder().id(theatreEntity.getId()).name(theatreEntity.getName())
                 .city(theatreEntity.getCity()).address(theatreEntity.getAddress()).build();
     }
}
