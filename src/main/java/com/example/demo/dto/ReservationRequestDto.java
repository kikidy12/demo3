package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

public class ReservationRequestDto {

    @Getter
    @Builder
    @AllArgsConstructor
    public static class ReservationAdd {
        private LocalDate checkin;
        private LocalDate checkout;
        private Integer peopleCount;
        private Long houseId;
    }
}
