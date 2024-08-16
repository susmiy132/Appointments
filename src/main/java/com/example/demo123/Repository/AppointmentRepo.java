package com.example.demo123.Repository;

import com.example.demo123.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
