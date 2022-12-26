package com.example.bookMyshow.DTO.ResponseDto;

import com.example.bookMyshow.DTO.TicketDto;

import java.util.List;

public class UserResponseDto {
    int id;

    String name;

    String mobNo;

    //Optional
    List<TicketDto> tickets;
}
