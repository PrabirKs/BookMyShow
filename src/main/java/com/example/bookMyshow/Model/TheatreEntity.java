package com.example.bookMyshow.Model;

import com.example.bookMyshow.enums.SeatType;
import com.example.bookMyshow.enums.TheatreType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter   //lombook is the dependency for getter and setter
@Setter
@Table(name = "theatres")
public class TheatreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = false)
    private String name ;

    @Column(name = "city",nullable = false)
    private String city ;

    @Column(name = "address",nullable = false)
    private String address ;


    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> shows ;

    TheatreType type ;

    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TheatreSeatEntity> seats = new ArrayList<>();

}
