package com.example.demo123.Pojo;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatientPojo {

    @Id
    private Integer patientId;
    private String patientName;
    private LocalDate dob;
    private String gender;
    private String address;
    private String phone;
    private String email;
}