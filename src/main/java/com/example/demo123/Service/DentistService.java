package com.example.demo123.Service;


import com.example.demo123.Entity.Dentist;
import com.example.demo123.Pojo.DentistPojo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DentistService {

    List<Dentist> getAllDentist();

    Optional<Dentist> getDentistById(Integer id);

    Dentist saveDentist(DentistPojo dentistPojo);

    Dentist updateDentist(Long id, Dentist dentistDetails);

    void deleteDentist(Long id);

}
