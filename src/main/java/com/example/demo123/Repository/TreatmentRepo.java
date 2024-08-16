package com.example.demo123.Repository;

import com.example.demo123.Entity.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentRepo extends JpaRepository<Treatment, Integer> {
}
