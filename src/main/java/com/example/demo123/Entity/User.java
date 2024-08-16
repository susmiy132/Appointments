package com.example.demo123.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Users_seq_gen")
    @SequenceGenerator(name = "Users_seq_gen", sequenceName = "Users_seq_gen", allocationSize = 1)

    @Id
    private Integer user_id;
    private String user_name;
    private String email;
    private String password;
    private String role;
}
