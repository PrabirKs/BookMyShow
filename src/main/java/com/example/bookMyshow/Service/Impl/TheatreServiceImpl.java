package com.example.bookMyshow.Service.Impl;


import com.example.bookMyshow.Converter.TheatreConverter;
import com.example.bookMyshow.DTO.TheatreDto;
import com.example.bookMyshow.Model.TheatreEntity;
import com.example.bookMyshow.Model.TheatreSeatEntity;
import com.example.bookMyshow.Repository.TheatreRepository;
import com.example.bookMyshow.Repository.TheatreSeatRepository;
import com.example.bookMyshow.Service.TheatreService;
import com.example.bookMyshow.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {
    @Autowired
    TheatreSeatRepository theatreSeatRepository ;
    @Autowired
    TheatreRepository theatreRepository ;
    //this class has 2 fun that is to add theater and get theater ,
    // to add a theater , first i have to first get the theaterDTo as input , then i have to convert it to the theaterEntity
    //then , a theater must have a id , city and address ,and set of seats, that is same for all theter . soo a theater owner can also
    //manually add seats , but we will add the seats from our end ;
    @Override
    public void addTheatre(TheatreDto theatreDto) {
        TheatreEntity theatreEntity = TheatreConverter.dtoToEntity(theatreDto) ;

        List<TheatreSeatEntity> seats = createTheatreSeat();   // function to create theaterSeat entity list .

        for(TheatreSeatEntity theatreSeat :seats){
            theatreSeat.setTheatre(theatreEntity);    // now for each theaterseat i'm setting the theater to it, so they can be intrConnected
        }

        theatreRepository.save(theatreEntity) ;      // Now after succesfull creation of the theater , i'm adding it to the TheaterRepo
    }
   //This function will create the theater sear entity and return the list
    public List<TheatreSeatEntity> createTheatreSeat() {
        List<TheatreSeatEntity> seats = new ArrayList<>() ;
        //adding the seats
        //at each steps i can add a new "THeaterSeatEntity Object , but here i am just cretaed another functoin for creating the
        //"TheaterSeatObject" by the >builder method
        seats.add(getTheaterSeat("1A",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1B",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1C",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1D",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1E",100,SeatType.CLASSIC));

        seats.add(getTheaterSeat("2A",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2B",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2C",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2D",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2E",200,SeatType.PREMIUM));

        theatreSeatRepository.saveAll(seats) ; // the seat has created , now they must be added in the repository of theaterSeat
        return  seats ;  //return the listOf seat
    }
    //another way of creating the object of the theaterSeatEntity
    public TheatreSeatEntity getTheaterSeat(String seatNo, int rate, SeatType seatType) {
        return TheatreSeatEntity.builder().seatNo(seatNo).rate(rate).seatType(seatType).build() ;
    }

    @Override
    public TheatreDto getTheatre(int id) {
        TheatreEntity theatreEntity = theatreRepository.findById(id).get() ;
        TheatreDto theatreDto = TheatreConverter.EntityToDto(theatreEntity) ;

        return theatreDto ;
    }
}
