package com.hospitalmanagement.hospital_management.service;

import com.hospitalmanagement.hospital_management.domain.Appointment;
import com.hospitalmanagement.hospital_management.repos.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired private AppointmentRepository repo;
    public List<Appointment> getAll() { return repo.findAll(); }
    public Appointment create(Appointment a) { return repo.save(a); }
    public List<Appointment> getByPatient(Long id) { return repo.findByPatientId(id); }
    public List<Appointment> getByDoctor(Long id) { return repo.findByDoctorId(id); }
    public Appointment updateStatus(Long id, String status) {
        Appointment a = repo.findById(id).orElseThrow();
        a.setStatus(status);
        return repo.save(a);
    }
    public void delete(Long id) { repo.deleteById(id); }
}