package com.example.bookMyshow.Repository;

import com.example.bookMyshow.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiotory extends JpaRepository<UserEntity,Integer> {
}
