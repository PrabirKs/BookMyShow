package com.example.bookMyshow.Repository;

import com.example.bookMyshow.Model.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatsRepository extends JpaRepository<ShowSeatEntity,Integer> {
}
