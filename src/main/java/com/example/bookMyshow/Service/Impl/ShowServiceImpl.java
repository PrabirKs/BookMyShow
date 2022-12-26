package com.example.bookMyshow.Service.Impl;

import com.example.bookMyshow.Converter.ShowConverter;
import com.example.bookMyshow.DTO.ShowDto;
import com.example.bookMyshow.Model.*;
import com.example.bookMyshow.Repository.MovieRepository;
import com.example.bookMyshow.Repository.ShowRepository;
import com.example.bookMyshow.Repository.TheatreRepository;
import com.example.bookMyshow.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShowServiceImpl implements ShowService {
    //we will have the showDto as input
    //by the DtoTOEntity Converter, i will convert the dto to entity , and set the id, name,starttime
    //after that i will set the showSeats,movie and theatre
    @Autowired
    MovieRepository movieRepository ;

    TheatreRepository theatreRepository ;

    @Autowired
    ShowRepository showRepository ;
    @Override
    public ShowDto addShow(ShowDto showDto) {
        //id , start time , startDate set
        ShowEntity showEntity = ShowConverter.DtoToEntity(showDto) ;

       //movie id extracted from shoeDto and search for its entity from the database . then set to the showEntity
        MovieEntity movieEntity = movieRepository.findById(showDto.getMovieDto().getId()).get() ;
        showEntity.setMovie(movieEntity);

        //Theater id extracted from shoeDto and search for its entity from the database . then set to the showEntity
        TheatreEntity theatreEntity = theatreRepository.findById(showDto.getTheatreDto().getId()).get() ;
        showEntity.setTheater(theatreEntity);

        //setting up the seat alice for this show , in the same theatre
        List<ShowSeatEntity> seats = createShowSeat(theatreEntity.getSeats(),showEntity) ;
        showEntity.setSeats(seats);

        showRepository.save(showEntity) ;

        return showDto;
    }
    //get the theater seat and convert it to the showseat type , and then set show to it .
    private List<ShowSeatEntity> createShowSeat(List<TheatreSeatEntity> seats, ShowEntity showEntity) {
        List<ShowSeatEntity> showSeats = new ArrayList<>( );

        for(TheatreSeatEntity seat : seats){
            ShowSeatEntity showSeat = ShowSeatEntity.builder().id(seat.getId()).rate(seat.getRate())
                                     .seatNumber(seat.getSeatNo()).seatType(seat.getSeatType()).show(showEntity).build() ;
            showSeats.add(showSeat) ;
        }
        return showSeats ;
    }

    @Override
    public ShowDto getShow(int id) {
        ShowDto showDto = ShowConverter.EntityToDto(showRepository.findById(id).get()) ;
    }
}
