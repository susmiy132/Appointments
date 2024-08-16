package com.example.demo123.Controller;


import com.example.demo123.Entity.Services;
import com.example.demo123.Pojo.ServicesPojo;
import com.example.demo123.Service.ServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/services")
@RequiredArgsConstructor
public class ServicesController {

    private final ServicesService servicesService;

    @GetMapping
    public ResponseEntity<List<Services>> getAllServices() {
        List<Services> services=servicesService.getAllServices();
        return ResponseEntity.ok(services);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Services>> getServicesById(@PathVariable Integer id) {
        Optional<Services> services=servicesService.getServicesById(id);
        return ResponseEntity.ok(services);
    }

    @PostMapping
    public ResponseEntity<Services> createServices(@RequestBody ServicesPojo servicesPojo) {
        Services services=servicesService.saveServices(servicesPojo);
        return ResponseEntity.ok(services);
    }

    @PutMapping
    public ResponseEntity<Services> updateServices(@PathVariable Long id, @RequestBody Services servicesDetails){
        Services updatedServices = servicesService.updateServices(id, servicesDetails);
        return ResponseEntity.ok(updatedServices);
    }
    @DeleteMapping("/{id}")
    public void deleteServices(@PathVariable Long id) {
        servicesService.deleteServices(id);
    }
}
