package com.example.bookMyshow.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter   //lombook is the dependency for getter and setter
@Setter
@Table(name="User")
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "name",nullable = false)
    private String name ;
    @Column(name = "name",nullable = false)
    private String mobile ;

    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)    //bidirectional mapping
    private List<TicketEntity> tickets ;
}
