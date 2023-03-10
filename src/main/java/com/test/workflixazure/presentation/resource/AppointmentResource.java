package com.test.workflixazure.presentation.resource;

import com.test.workflixazure.persistence.entity.Appointment;
import com.test.workflixazure.presentation.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("appointment")
public class AppointmentResource {
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentResource(AppointmentService appointmentService){
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> allAppointments() {
        return appointmentService.getAllAppointments();
    }

}
