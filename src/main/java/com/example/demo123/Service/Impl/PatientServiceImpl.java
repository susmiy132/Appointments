package com.example.demo123.Service.Impl;

import com.example.demo123.Entity.Patient;
import com.example.demo123.Pojo.PatientPojo;
import com.example.demo123.Repository.PatientRepo;
import com.example.demo123.Service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class PatientServiceImpl implements PatientService {

    private final PatientRepo patientRepo;

    @Override
    public List<Patient> getAllPatient() {
        return patientRepo.findAll();
    }

    @Override
    public Optional<Patient> getUserById(Integer id) {
        return patientRepo.findById(id);
    }

    @Override
    public Patient savePatient(PatientPojo patientPojo) {
        Patient patient = new Patient();
        patient.setPatientId(patient.getPatientId());
        patient.setPatientName(patient.getPatientName());
        patient.setPhone(patient.getPhone());
        patient.setEmail(patient.getEmail());
        patient.setDob(patient.getDob());
        patient.setAddress(patient.getAddress());
        patient.setGender(patient.getGender());
        return patientRepo.save(patient);
    }


    @Override
    public Patient updatePatient(Long id, Patient patientDetails) {
        Optional<Patient> optionalPatient = patientRepo.findById(Math.toIntExact(id));
        if(optionalPatient.isPresent()){
            Patient patient = optionalPatient.get();
            patient.setPhone(patient.getPhone());
            patient.setPatientName(patient.getPatientName());
            patient.setPatientId(patient.getPatientId());
            return patientRepo.save(patient);

        }else{
            return null;
        }
    }

    @Override
    public void deletePatient(Long id) {
        patientRepo.deleteById(Math.toIntExact(id));
    }
}
