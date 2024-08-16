package com.example.demo123.Service.Impl;

import com.example.demo123.Entity.Services;
import com.example.demo123.Pojo.ServicesPojo;
import com.example.demo123.Repository.ServicesRepo;
import com.example.demo123.Service.ServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ServicesImpl implements ServicesService {


    private final ServicesRepo serviceRepo;

    @Override
    public List<Services> getAllServices() {
        return serviceRepo.findAll();
    }


    @Override
    public Optional<Services> getServicesById(Integer id) {
        return serviceRepo.findById(id);
    }


    @Override
    public Services saveServices(ServicesPojo servicesPojo) {
        Services service = new Services();
        service.setId(servicesPojo.getId());
        service.setImage(servicesPojo.getImage());
        service.setTitle(servicesPojo.getTitle());
        service.setDescription(servicesPojo.getDescription());
        return serviceRepo.save(service);
    }

    @Override
    public Services updateServices(Long id, Services servicesDetails) {
        Optional<Services> optionalServices = serviceRepo.findById(Math.toIntExact(id));
        if(optionalServices.isPresent()){
            Services services = optionalServices.get();
            services.setImage(services.getImage());
            services.setTitle(services.getTitle());
            services.setDescription(services.getDescription());
            return serviceRepo.save(services);

        }else{
            return null;
        }
    }


    @Override
    public void deleteServices(Long id) {
        serviceRepo.deleteById(Math.toIntExact(id));
    }
}
