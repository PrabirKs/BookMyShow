package com.example.bookMyshow.DTO;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//here we will not write the @Entity cause , it will not going to interact with the database , it s just a medium

public class UserDto {
    private int id ;
    @NonNull
    private String name ;
    @NonNull
    private String mobile ;
}
