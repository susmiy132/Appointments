package com.example.demo123.Controller;

import com.example.demo123.Entity.Dentist;
import com.example.demo123.Pojo.DentistPojo;
import com.example.demo123.Service.DentistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dentists")
@RequiredArgsConstructor
public class DentistController {
    private final DentistService dentistService;

    @GetMapping
    public ResponseEntity<List<Dentist>> getAllDentist() {
        List<Dentist> dentist=dentistService.getAllDentist();
        return ResponseEntity.ok(dentist);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Dentist>> getDentistById(@PathVariable Integer id) {
        Optional<Dentist> dentist=dentistService.getDentistById(id);
        return ResponseEntity.ok(dentist);
    }

    @PostMapping
    public ResponseEntity<Dentist> createDentist(@RequestBody DentistPojo dentistPojo) {
        Dentist dentist=dentistService.saveDentist(dentistPojo);
        return ResponseEntity.ok(dentist);
    }

    @PutMapping
    public ResponseEntity<Dentist> updateDentist(@PathVariable Long id, @RequestBody Dentist dentistDetails){
        Dentist updatedDentist = dentistService.updateDentist(id, dentistDetails);
        return ResponseEntity.ok(updatedDentist);
    }
    @DeleteMapping("/{id}")
    public void deleteDentist(@PathVariable Long id) {
        dentistService.deleteDentist(id);
    }
}
