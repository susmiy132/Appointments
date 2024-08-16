package com.example.demo123.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "service")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Services {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "treatment_seq_gen")
    @SequenceGenerator(name = "treatment_seq_gen", sequenceName = "treatment_seq_gen", allocationSize = 1)

    @Id
    private Integer id;
    private String image;
    private String title;
    private String description;

}
