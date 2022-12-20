package com.example.bookMyshow.Service;

import com.example.bookMyshow.DTO.TheatreDto;

public interface TheatreService {
    //add
    void addTheatre(TheatreDto theatreDto);

    TheatreDto getTheatre(int id) ;

    //get
}
