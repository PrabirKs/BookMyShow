package com.example.bookMyshow.Service;

import com.example.bookMyshow.DTO.MovieDto;

public interface MovieService {
    //add
     MovieDto addMovie(MovieDto movieDto) ;

     //get
     MovieDto getMovie(int id) ;
}
