package com.example.bookMyshow.Service.Impl;

import com.example.bookMyshow.Converter.MovieConverter;
import com.example.bookMyshow.DTO.MovieDto;
import com.example.bookMyshow.Model.MovieEntity;
import com.example.bookMyshow.Repository.MovieRepository;
import com.example.bookMyshow.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository ;

    @Override
    public MovieDto addMovie(MovieDto movieDto) {
        MovieEntity movieEntity = MovieConverter.dtoToEntity(movieDto) ;
        movieRepository.save(movieEntity) ;

        return movieDto;
    }

    @Override
    public MovieDto getMovie(int id) {
        //the findbyid may not give the movie if it is not present inside the db .
        //so at that case, it is advisable to use optional as the return type .
        //else we can use .get() .
        // or we can use .orELse(movie) ; create a movie entity object and incase
        //it return null by  not finding , return that object ;
        MovieEntity movieEntity = movieRepository.findById(id).get();
        MovieDto movieDto = MovieConverter.entityToDto(movieEntity) ;

        return movieDto ;
    }
}
