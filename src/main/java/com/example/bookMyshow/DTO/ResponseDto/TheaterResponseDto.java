package com.example.bookMyshow.DTO.ResponseDto;

import com.example.bookMyshow.enums.TheatreType;
import com.sun.istack.NotNull;

public class TheaterResponseDto {
    @NotNull
    int id;

    String name;
    String address;
    String city;
    TheatreType type;
    //Show Entity
}
