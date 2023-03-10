package com.test.workflixazure.presentation.service.impl;

import com.test.workflixazure.persistence.dao.AppointmentDao;
import com.test.workflixazure.persistence.entity.Appointment;
import com.test.workflixazure.presentation.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentDao appointmentDao;

    @Autowired
    public AppointmentServiceImpl(AppointmentDao appointmentDao){
        this.appointmentDao = appointmentDao;
    }


    @Override
    public Appointment createAppointment(Appointment appointment){
        return appointmentDao.createAppointment(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments(){
        return appointmentDao.getAllAppointments();
    }
}
