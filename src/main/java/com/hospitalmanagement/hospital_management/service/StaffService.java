package com.hospitalmanagement.hospital_management.service;

import com.hospitalmanagement.hospital_management.domain.Staff;
import com.hospitalmanagement.hospital_management.repos.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffService {
    @Autowired private StaffRepository repo;
    public List<Staff> getAll() { return repo.findAll(); }
    public Staff create(Staff s) { return repo.save(s); }
    public List<Staff> getByDepartment(Long id) { return repo.findByDepartmentId(id); }
    public void delete(Long id) { repo.deleteById(id); }
}