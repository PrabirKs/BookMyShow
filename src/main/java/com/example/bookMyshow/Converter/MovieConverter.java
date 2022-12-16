package com.example.bookMyshow.Converter;

import com.example.bookMyshow.DTO.MovieDto;
import com.example.bookMyshow.Model.MovieEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {
    public static MovieEntity dtoToEntity(MovieDto movieDto){
        return MovieEntity.builder().name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
    }
    public static MovieDto entityToDto(MovieEntity movieEntity){
        return MovieDto.builder().name(movieEntity.getName()).
                releaseDate(movieEntity.getReleaseDate()).
                name(movieEntity.getName()).id(movieEntity.getId()).build() ;
    }
}
