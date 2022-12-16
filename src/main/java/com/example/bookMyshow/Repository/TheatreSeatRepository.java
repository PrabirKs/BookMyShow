package com.example.bookMyshow.Repository;

import com.example.bookMyshow.Model.TheatreSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreSeatRepository extends JpaRepository<TheatreSeatEntity,Integer> {
}
