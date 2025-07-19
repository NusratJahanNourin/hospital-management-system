package com.hospitalmanagement.hospital_management.service;

import com.hospitalmanagement.hospital_management.domain.Department;
import com.hospitalmanagement.hospital_management.repos.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired private DepartmentRepository repo;
    public List<Department> getAll() { return repo.findAll(); }
    public Department get(Long id) { return repo.findById(id).orElseThrow(); }
    public Department create(Department d) { return repo.save(d); }
    public Department update(Long id, Department d) {
        d.setDepartmentId(id);
        return repo.save(d);
    }
    public void delete(Long id) { repo.deleteById(id); }
}