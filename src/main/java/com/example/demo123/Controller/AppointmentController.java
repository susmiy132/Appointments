package com.example.demo123.Controller;

import com.example.demo123.Entity.Appointment;
import com.example.demo123.Pojo.AppointmentPojo;
import com.example.demo123.Service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RequestMapping("/appointments")
@RestController
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    @GetMapping
    public ResponseEntity<List<Appointment>> getAllAppointment() {
        List<Appointment> appointment=appointmentService.getAllAppointment();
        return ResponseEntity.ok(appointment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Appointment>> getAppointmentById(@PathVariable Integer id) {
        Optional<Appointment> appointment=appointmentService.getAppointmentById(id);
        return ResponseEntity.ok(appointment);
    }

    @PostMapping
    public ResponseEntity<Appointment> createAppointment(@RequestBody AppointmentPojo appointmentPojo) {
        Appointment appointment=appointmentService.saveAppointment(appointmentPojo);
        return ResponseEntity.ok(appointment);
    }

    @PutMapping
    public ResponseEntity<Appointment> updateAppointment(@PathVariable Long id, @RequestBody Appointment appointmentDetails){
        Appointment updatedAppointment = appointmentService.updateAppointment(id, appointmentDetails);
        return ResponseEntity.ok(updatedAppointment);
    }
    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        appointmentService.deleteAppointment(id);
    }
}
