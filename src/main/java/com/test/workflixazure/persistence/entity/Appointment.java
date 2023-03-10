package com.test.workflixazure.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "appointment_table")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="appointment_date")
    private String appointmentDate;

    @Column(name="appointment_text")
    private String appointmentText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentText() {
        return appointmentText;
    }

    public void setAppointmentText(String appointmentText) {
        this.appointmentText = appointmentText;
    }
}
