package com.example.bookMyshow.DTO.EntryDto;

import com.example.bookMyshow.DTO.ResponseDto.MovieResponseDto;
import com.sun.istack.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

public class ShowEntryDto {
    @NotNull
    LocalDate showDate;

    @NotNull
    LocalTime showTime;

    @NotNull
    MovieResponseDto movieResponseDto;

    @NotNull
    TheaterResponseDto theaterResponseDto;
}
