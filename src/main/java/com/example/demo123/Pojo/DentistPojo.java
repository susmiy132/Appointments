package com.example.demo123.Pojo;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DentistPojo {
    private Long dentistId;
    private String degree;
    private String specialization;
    private String working_days;
    private String training_days;
}
