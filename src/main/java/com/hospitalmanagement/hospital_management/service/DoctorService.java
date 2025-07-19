package com.hospitalmanagement.hospital_management.service;

import com.hospitalmanagement.hospital_management.domain.Doctor;
import com.hospitalmanagement.hospital_management.repos.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {
    @Autowired private DoctorRepository repo;
    public List<Doctor> getAll() { return repo.findAll(); }
    public Doctor get(Long id) { return repo.findById(id).orElseThrow(); }
    public Doctor create(Doctor d) { return repo.save(d); }
    public Doctor update(Long id, Doctor d) {
        d.setDoctorId(id);
        return repo.save(d);
    }
    public List<Doctor> getByDepartment(Long departmentId) { return repo.findByDepartmentId(departmentId); }
    public void delete(Long id) { repo.deleteById(id); }
}