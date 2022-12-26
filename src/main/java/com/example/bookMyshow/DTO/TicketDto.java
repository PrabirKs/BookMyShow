package com.example.bookMyshow.DTO;

import com.example.bookMyshow.DTO.ResponseDto.ShowResponseDto;
import com.example.bookMyshow.DTO.ResponseDto.UserResponseDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {
    int id;

    String alloted_seats;

    double amount;

    ShowResponseDto showDto;

    @NotNull
    UserResponseDto userDto;  //a ticket dto must have the userdto , cz it carry the details of the ticket to whoom it belong
}
