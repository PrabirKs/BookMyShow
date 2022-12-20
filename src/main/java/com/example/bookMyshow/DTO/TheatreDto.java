package com.example.bookMyshow.DTO;

import com.example.bookMyshow.enums.TheatreType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheatreDto {
    private int id ;
    private String name ;
    private String city ;
    private String address ;

    ShowDto showDto ;


}
