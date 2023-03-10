package com.test.workflixazure.persistence.dao;

import com.test.workflixazure.persistence.entity.Appointment;

import java.util.List;

public interface AppointmentDao {
    List<Appointment> getAllAppointments();

    Appointment createAppointment(Appointment appointment);
}
