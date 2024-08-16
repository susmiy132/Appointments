package com.example.demo123.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "treatments")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Treatment {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "treatment_seq_gen")
    @SequenceGenerator(name = "treatment_seq_gen", sequenceName = "treatment_seq_gen", allocationSize = 1)

    @Id
    private Integer id;
    private String notes;
    private String prescriptions;

//    @OneToOne
//    @JoinColumn(name = "appointment_id")
//    private Appointment appointment;
}
