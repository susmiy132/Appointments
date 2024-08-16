package com.example.demo123.Controller;

import com.example.demo123.Entity.Treatment;
import com.example.demo123.Pojo.TreatmentPojo;
import com.example.demo123.Service.TreatmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/treatment")
@RequiredArgsConstructor
public class TreatmentController {

    private final TreatmentService treatmentService;

    @GetMapping
    public ResponseEntity<List<Treatment>> getAllTreatment() {
        List<Treatment> treatment=treatmentService.getAllTreatment();
        return ResponseEntity.ok(treatment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Treatment>> getTreatmentById(@PathVariable Integer id) {
        Optional<Treatment> treatment=treatmentService.getTreatmentById(id);
        return ResponseEntity.ok(treatment);
    }

    @PostMapping
    public ResponseEntity<Treatment> createTreatment(@RequestBody TreatmentPojo treatmentPojo) {
        Treatment treatment=treatmentService.saveTreatment(treatmentPojo);
        return ResponseEntity.ok(treatment);
    }

    @PutMapping
    public ResponseEntity<Treatment> updateTreatment(@PathVariable Long id, @RequestBody Treatment treatmentDetails){
        Treatment updatedTreatment = treatmentService.updateTreatment(id, treatmentDetails);
        return ResponseEntity.ok(updatedTreatment);
    }
    @DeleteMapping("/{id}")
    public void deleteTreatment(@PathVariable Long id) {
        treatmentService.deleteTreatment(id);
    }

}
