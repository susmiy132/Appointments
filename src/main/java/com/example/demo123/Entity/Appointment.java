package com.example.demo123.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.security.PrivateKey;
import java.util.Date;

@Entity
@Table(name = "appointments")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Appointment {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_seq_gen")
    @SequenceGenerator(name = "appointment_seq_gen", sequenceName = "appointment_seq_gen", allocationSize = 1)

    @Id
    private Integer appointment_id;
    private String doctor_avatar;
    private String doctor_name;
    private String doctor_speciality;
    private String doctor_degree;
    private String patient_avatar;
    private String patient_name;
    private String patient_problem;

    private Date Appoint_date;
    private Date Approve_date;
    private String appoint_status;

    @Enumerated(EnumType.STRING)
    private Status status;

//    @ManyToOne
//    @JoinColumn(name = "patientId")
//    private Patient patient;
//
//    @ManyToOne
//    @JoinColumn(name = "dentistId")
//    private Dentist dentist;

    public enum Status{
        SCHEDULED, COMPLETED, CANCELED
    }
}
