package com.example.bookMyshow.Repository;

import com.example.bookMyshow.Model.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {

}
