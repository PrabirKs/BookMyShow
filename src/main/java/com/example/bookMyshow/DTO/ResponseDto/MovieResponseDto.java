package com.example.bookMyshow.DTO.ResponseDto;

import com.sun.istack.NotNull;

import java.time.LocalDate;

public class MovieResponseDto {
    @NotNull
    int id;
    String name;
    LocalDate releaseDate;

    //Optional
    List<ShowResponseDto> showDtoList;
}
