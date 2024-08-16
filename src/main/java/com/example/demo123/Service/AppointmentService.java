package com.example.demo123.Service;

import com.example.demo123.Entity.Appointment;
import com.example.demo123.Pojo.AppointmentPojo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface AppointmentService {
    List<Appointment> getAllAppointment();

    Optional<Appointment> getAppointmentById(Integer id);

    Appointment saveAppointment(AppointmentPojo appointmentPojo);

    Appointment updateAppointment(Long id, Appointment appointmentDetails);

    void deleteAppointment(Long id);
}
