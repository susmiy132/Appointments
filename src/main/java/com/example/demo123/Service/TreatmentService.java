package com.example.demo123.Service;

import com.example.demo123.Entity.Treatment;
import com.example.demo123.Pojo.TreatmentPojo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface TreatmentService {


    List<Treatment> getAllTreatment();

    Optional<Treatment> getTreatmentById(Integer id);

    Treatment saveTreatment(TreatmentPojo treatmentPojo);

    Treatment updateTreatment(Long id, Treatment treatmentDetails);

    void deleteTreatment(Long id);
}
