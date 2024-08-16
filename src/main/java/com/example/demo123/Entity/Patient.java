package com.example.demo123.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "patients")
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_seq_gen")
    @SequenceGenerator(name = "patient_seq_gen", sequenceName = "patient_seq_gen", allocationSize = 1)

    private Integer patientId;

    private String patientName;
    private LocalDate dob;
    private String gender;
    private String address;
    private String phone;
    private String email;

//    getters and setters
//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "patientId")
//    private User user;

}