package com.example.demo123.Service;

import com.example.demo123.Entity.Services;
import com.example.demo123.Pojo.ServicesPojo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ServicesService {

    List<Services> getAllServices();

    Optional<Services> getServicesById(Integer id);

    Services saveServices(ServicesPojo servicesPojo);

    Services updateServices(Long id, Services servicesDetails);

    void deleteServices(Long id);
}
