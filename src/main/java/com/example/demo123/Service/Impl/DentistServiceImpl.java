package com.example.demo123.Service.Impl;


import com.example.demo123.Entity.Dentist;
import com.example.demo123.Pojo.DentistPojo;
import com.example.demo123.Repository.DentistRepo;
import com.example.demo123.Service.DentistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor


public class DentistServiceImpl implements DentistService {

    private final DentistRepo dentistRepo;

    @Override
    public List<Dentist> getAllDentist() {
        return dentistRepo.findAll();
    }

    @Override
    public Optional<Dentist> getDentistById(Integer id) {
        return dentistRepo.findById(id);
    }

    @Override
    public Dentist saveDentist(DentistPojo dentistPojo) {
        Dentist dentists = new Dentist();
        dentists.setDentistId(dentistPojo.getDentistId());
        dentists.setDegree(dentistPojo.getDegree());
        dentists.setWorking_days(dentistPojo.getWorking_days());
        dentists.setTraining_days(dentistPojo.getTraining_days());
        dentists.setSpecialization(dentistPojo.getSpecialization());
        dentists.setSpecialization(dentistPojo.getSpecialization());
        return dentistRepo.save(dentists);
    }

    @Override
    public Dentist updateDentist(Long id, Dentist dentistDetails) {
        Optional<Dentist> optionalDentist = dentistRepo.findById(Math.toIntExact(id));
        if(optionalDentist.isPresent()){
            Dentist dentist = optionalDentist.get();
            dentist.setDegree(dentist.getDegree());
            dentist.setWorking_days(dentist.getWorking_days());
            dentist.setTraining_days(dentist.getTraining_days());
            dentist.setSpecialization(dentist.getSpecialization());
            dentist.setSpecialization(dentist.getSpecialization());
            return dentistRepo.save(dentist);

        }else{
            return null;
        }
    }

    @Override
    public void deleteDentist(Long id) {
        dentistRepo.deleteById(Math.toIntExact(id));
    }
}
