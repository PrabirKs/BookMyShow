package com.example.bookMyshow.DTO;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShowDto {
    private int id ;
    private LocalDate  showDate ;
    private LocalTime showTime ;
    private MovieDto movieDto ;
    private TheatreDto theatreDto ;

}
