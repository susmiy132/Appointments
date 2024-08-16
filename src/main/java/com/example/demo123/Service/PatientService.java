package com.example.demo123.Service;

import com.example.demo123.Entity.Patient;
import com.example.demo123.Pojo.PatientPojo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PatientService {

    List<Patient> getAllPatient();

    Optional<Patient> getUserById(Integer id);

    Patient savePatient(PatientPojo patientPojo);

    Patient updatePatient(Long id, Patient patientDetails);

    void deletePatient(Long id);
}
