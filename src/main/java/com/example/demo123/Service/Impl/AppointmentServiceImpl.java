package com.example.demo123.Service.Impl;

import com.example.demo123.Entity.Appointment;
import com.example.demo123.Pojo.AppointmentPojo;
import com.example.demo123.Repository.AppointmentRepo;
import com.example.demo123.Service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepo appointmentRepo;

    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepo.findAll();
    }

    @Override
    public Optional<Appointment> getAppointmentById(Integer id) {
        return appointmentRepo.findById(id);
    }

    @Override
    public Appointment saveAppointment(AppointmentPojo appointmentPojo) {
        Appointment appointment = new Appointment();
        appointment.setAppointment_id(appointmentPojo.getAppointment_id());
        appointment.setDoctor_avatar(appointmentPojo.getDoctor_avatar());
        appointment.setDoctor_name(appointmentPojo.getDoctor_name());
        appointment.setDoctor_speciality(appointmentPojo.getDoctor_speciality());
        appointment.setDoctor_degree(appointmentPojo.getDoctor_degree());
        appointment.setPatient_avatar(appointmentPojo.getPatient_avatar());
        appointment.setPatient_name(appointmentPojo.getPatient_name());
        appointment.setPatient_problem(appointmentPojo.getPatient_problem());
        appointment.setAppoint_date(appointmentPojo.getAppoint_date());
        appointment.setApprove_date(appointmentPojo.getApprove_date());
        appointment.setAppoint_status(appointment.getAppoint_status());
        appointment.setStatus(appointment.getStatus());
        return appointmentRepo.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment appointmentDetails) {
        Optional<Appointment> optionalAppointment = appointmentRepo.findById(Math.toIntExact(id));
        if(optionalAppointment.isPresent()){
            Appointment appointment = optionalAppointment.get();
            appointment.setDoctor_avatar(appointment.getDoctor_avatar());
            appointment.setDoctor_name(appointment.getDoctor_name());
            appointment.setDoctor_speciality(appointment.getDoctor_speciality());
            appointment.setDoctor_degree(appointment.getDoctor_degree());
            appointment.setPatient_avatar(appointment.getPatient_avatar());
            appointment.setPatient_name(appointment.getPatient_name());
            appointment.setPatient_problem(appointment.getPatient_problem());
            appointment.setAppoint_date(appointment.getAppoint_date());
            appointment.setApprove_date(appointment.getApprove_date());
            appointment.setAppoint_status(appointment.getAppoint_status());
            return appointmentRepo.save(appointment);

        }else{
            return null;
        }
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentRepo.deleteById(Math.toIntExact(id));
    }
}
