package com.test.workflixazure.presentation.service;

import com.test.workflixazure.persistence.dao.AppointmentDao;
import com.test.workflixazure.persistence.entity.Appointment;

import java.util.List;

public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> getAllAppointments();
}
