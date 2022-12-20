package com.example.bookMyshow.Service;

import com.example.bookMyshow.DTO.ShowDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowService {
    //add
    ShowDto addShow(ShowDto showDto) ;

    //get
    ShowDto getShow(int id) ;
}
