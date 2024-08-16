package com.example.demo123.Controller;

import com.example.demo123.Entity.Patient;
import com.example.demo123.Entity.User;
import com.example.demo123.Pojo.PatientPojo;
import com.example.demo123.Pojo.UserPojo;
import com.example.demo123.Service.PatientService;
import com.example.demo123.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor

public class PatientController {

    private final PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatient() {
        List<Patient> patients=patientService.getAllPatient();
        return ResponseEntity.ok(patients);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Patient>> getUserById(@PathVariable Integer id) {
        Optional<Patient> patient=patientService.getUserById(id);
        return ResponseEntity.ok(patient);
    }

    @PostMapping
    public ResponseEntity<Patient> createPatient(@RequestBody PatientPojo patientPojo) {
        Patient patient=patientService.savePatient(patientPojo);
        return ResponseEntity.ok(patient);
    }

    @PutMapping
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient patientDetails){
        Patient updatedPatient = patientService.updatePatient(id, patientDetails);
        return ResponseEntity.ok(updatedPatient);
    }
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
    }
}
