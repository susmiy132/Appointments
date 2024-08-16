package com.example.demo123.Repository;

import com.example.demo123.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository <Patient, Integer> {
}
