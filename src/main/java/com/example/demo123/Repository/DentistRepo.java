package com.example.demo123.Repository;

import com.example.demo123.Entity.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepo extends JpaRepository<Dentist, Integer> {

}
