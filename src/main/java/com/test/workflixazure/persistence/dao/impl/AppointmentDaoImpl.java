package com.test.workflixazure.persistence.dao.impl;

import com.test.workflixazure.persistence.dao.AppointmentDao;
import com.test.workflixazure.persistence.entity.Appointment;
import com.test.workflixazure.persistence.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentDaoImpl implements AppointmentDao {
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentDaoImpl(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment createAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }
}
