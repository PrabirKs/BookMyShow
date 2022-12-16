package com.example.bookMyshow.Service.Impl;

import com.example.bookMyshow.Converter.UserConverter;
import com.example.bookMyshow.DTO.UserDto;
import com.example.bookMyshow.Model.UserEntity;
import com.example.bookMyshow.Repository.UserReposiotory;
import com.example.bookMyshow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserReposiotory userReposiotory ;

    @Override
    public void addUser(UserDto userDto) {
        UserEntity userEntity = UserConverter.dtoToEntity(userDto) ;
        //userReposiotory.save(userDto) ;  //this thing can't take place , cz the repository don't interact with the databases
        userReposiotory.save(userEntity) ;  //first convert it to userentity then add it in database

    }

    @Override
    public UserDto getUser(int id) {
        UserEntity userEntity = userReposiotory.findById(id).get() ;
        UserDto userDto = UserConverter.entityToDto(userEntity) ;

        return userDto;
    }
}
