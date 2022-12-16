package com.example.bookMyshow.Service;

import com.example.bookMyshow.DTO.MovieDto;

public interface MovieService {
    //add
     void addMovie(MovieDto movieDto) ;

     //get
     MovieDto getMovie(int id) ;
}
