package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CheckResponseDto {
    private Boolean duplicate;


    public CheckResponseDto(){
        duplicate = true;
    }
}
