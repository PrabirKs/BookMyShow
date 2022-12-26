package com.example.bookMyshow.DTO.EntryDto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

//we are making this to reduce the heavy api call
//and just take required parameters
@Getter
@Builder
public class MovieEntryDto {
    String name;

    @NotNull
    LocalDate releaseDate;
}
