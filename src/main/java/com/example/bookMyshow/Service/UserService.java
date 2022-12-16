package com.example.bookMyshow.Service;

import com.example.bookMyshow.DTO.UserDto;
import com.example.bookMyshow.Model.UserEntity;

public interface UserService {
    //add
    public void addUser(UserDto userDto) ;
    //get
    public UserDto getUser(int id) ;
}
