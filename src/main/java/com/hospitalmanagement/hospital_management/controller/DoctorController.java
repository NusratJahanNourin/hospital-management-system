package com.hospitalmanagement.hospital_management.controller;

import com.hospitalmanagement.hospital_management.domain.Doctor;
import com.hospitalmanagement.hospital_management.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @Autowired private DoctorService doctorService;

    @GetMapping public List<Doctor> getAll() { return doctorService.getAll(); }
    @GetMapping("/{id}") public Doctor get(@PathVariable Long id) { return doctorService.get(id); }
    @PostMapping public Doctor create(@RequestBody Doctor d) { return doctorService.create(d); }
    @PutMapping("/{id}") public Doctor update(@PathVariable Long id, @RequestBody Doctor d) { return doctorService.update(id, d); }
    @GetMapping("/department/{departmentId}") public List<Doctor> getByDepartment(@PathVariable Long departmentId) {
        return doctorService.getByDepartment(departmentId);
    }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { doctorService.delete(id); }
}