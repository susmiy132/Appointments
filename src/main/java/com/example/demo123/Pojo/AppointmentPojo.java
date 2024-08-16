package com.example.demo123.Pojo;

import ch.qos.logback.core.status.Status;
import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class AppointmentPojo {

    private Integer appointment_id;
    private String doctor_avatar;
    private String doctor_name;
    private String doctor_speciality;
    private String doctor_degree;
    private String patient_avatar;
    private String patient_name;
    private String patient_problem;

    private Date Appoint_date;
    private Date Approve_date;
    private String appoint_status;
}
