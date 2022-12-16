package com.example.bookMyshow.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter   //lombook is the dependency for getter and setter
@Setter
@Table(name="Ticket")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id ;

    @Column(name = "alloted_seats",nullable = false)
    private String allotedSeat ;

    @Column(name = "amount",nullable = false)
    private int amount ;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booked_at",nullable = false)
    private Date bookedAt ;

    @ManyToOne
    @JoinColumn
    @JsonIgnore     //user need not to be passed in tivket object body , work in post man

    private UserEntity user ;    //user's pk is treated as fk in the ticket table

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private ShowEntity show ;

    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowSeatEntity> seats ;
}
