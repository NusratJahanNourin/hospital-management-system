package com.hospitalmanagement.hospital_management.repos;

import com.hospitalmanagement.hospital_management.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatientId(Long id);

    List<Appointment> findByDoctorId(Long id);
}
