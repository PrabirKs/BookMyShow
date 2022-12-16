package com.example.bookMyshow.Converter;

import com.example.bookMyshow.DTO.UserDto;
import com.example.bookMyshow.Model.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass  //it never instanitiate , no object needed for fun uses
public class UserConverter {

    public static UserEntity dtoToEntity(UserDto userDto){  //id is auto incremeneted
        return UserEntity.builder().name(userDto.getName()).mobile(userDto.getMobile()).build() ;
        //@builder should be added in the parent class
    }

    public static UserDto entityToDto(UserEntity userEntity){
        return UserDto.builder().name(userEntity.getName()).
                mobile(userEntity.getMobile()).id(userEntity.getId()).build() ;
    }
}
