package com.example.bookMyshow.Converter;

import com.example.bookMyshow.DTO.TheatreDto;
import com.example.bookMyshow.Model.TheatreEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheatreConverter {
     public static TheatreEntity dtoToEntity(TheatreDto theatreDto){
         return TheatreEntity.builder().name(theatreDto.getName()).city(theatreDto.getCity()).address(theatreDto.getAddress()).build() ;
     }
}
