package com.example.demo123.Service.Impl;

import com.example.demo123.Entity.Treatment;
import com.example.demo123.Pojo.TreatmentPojo;
import com.example.demo123.Repository.TreatmentRepo;
import com.example.demo123.Service.TreatmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class TreatmentServiceImpl implements TreatmentService {

    private final TreatmentRepo treatmentRepo;

    @Override
    public List<Treatment> getAllTreatment() {
        return treatmentRepo.findAll();
    }

    @Override
    public Optional<Treatment> getTreatmentById(Integer id) {
        return treatmentRepo.findById(id);
    }

    @Override
    public Treatment saveTreatment(TreatmentPojo treatmentPojo) {
        Treatment treatments = new Treatment();
        treatments.setId(treatments.getId());
        treatments.setNotes(treatments.getNotes());
        treatments.setPrescriptions(treatments.getPrescriptions());
        return treatmentRepo.save(treatments);
    }

    @Override
    public Treatment updateTreatment(Long id, Treatment treatmentDetails) {
        Optional<Treatment> optionalTreatment = treatmentRepo.findById(Math.toIntExact(id));
        if(optionalTreatment.isPresent()){
            Treatment treatment = optionalTreatment.get();
            treatment.setPrescriptions(treatment.getPrescriptions());
            treatment.setNotes(treatment.getNotes());
            return treatmentRepo.save(treatment);

        }else{
            return null;
        }
    }

    @Override
    public void deleteTreatment(Long id) {
        treatmentRepo.deleteById(Math.toIntExact(id));
    }
}

