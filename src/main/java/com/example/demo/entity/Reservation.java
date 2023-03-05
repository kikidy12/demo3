package com.example.demo.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "reservations")
@Getter
@NoArgsConstructor
public class Reservation extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate checkin;
    private LocalDate checkout;
    private Integer peopleCount;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private House house;

    @Builder
    public Reservation(Long id, LocalDate checkin, LocalDate checkout, Integer peopleCount, User user, House house) {
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
        this.peopleCount = peopleCount;
        this.user = user;
        this.house = house;
    }
}
