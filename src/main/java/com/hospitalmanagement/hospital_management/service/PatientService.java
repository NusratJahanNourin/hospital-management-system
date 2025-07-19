package com.hospitalmanagement.hospital_management.service;

import com.hospitalmanagement.hospital_management.domain.Patient;
import com.hospitalmanagement.hospital_management.repos.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {
    @Autowired private PatientRepository repo;
    public List<Patient> getAll() { return repo.findAll(); }
    public Patient get(Long id) { return repo.findById(id).orElseThrow(); }
    public Patient create(Patient p) { return repo.save(p); }
    public Patient update(Long id, Patient p) {
        p.setPatientId(id);
        return repo.save(p);
    }
    public void delete(Long id) { repo.deleteById(id); }
}