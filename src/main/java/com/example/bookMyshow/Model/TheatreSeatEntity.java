package com.example.bookMyshow.Model;

import com.example.bookMyshow.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "theatre_seats")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString     // why >?
public class TheatreSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "seat_number",nullable = false)
    private String seatNo ;

    @Column(name = "rate",nullable = false)
    private int rate ;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type",nullable = false)
    private SeatType seatType ;


    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private TheatreEntity theatre ;
}
