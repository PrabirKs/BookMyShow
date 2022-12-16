package com.example.bookMyshow.Repository;

import com.example.bookMyshow.Model.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<TheatreEntity,Integer> {
}
