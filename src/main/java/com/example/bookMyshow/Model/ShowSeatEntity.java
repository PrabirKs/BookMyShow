package com.example.bookMyshow.Model;

import com.example.bookMyshow.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
@Table(name = "show_seats")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "seat_number",nullable = false)
    private String seatNumber ;

    @Column(name = "rate",nullable = false)
    private int rate ;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type",nullable = false)
    private SeatType seatType ;

    @Column(name = "is_booked",nullable = false)
    private boolean booked ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="booked_at")
    private Date bookedAt ;

    @ManyToOne
    @JsonIgnore
    private ShowEntity show ;

    @ManyToOne
    @JsonIgnore
    private TicketEntity ticket ;
}
