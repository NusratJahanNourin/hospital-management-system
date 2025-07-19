package com.hospitalmanagement.hospital_management.controller;

import com.hospitalmanagement.hospital_management.domain.Patient;
import com.hospitalmanagement.hospital_management.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired private PatientService patientService;

    @GetMapping public List<Patient> getAll() { return patientService.getAll(); }
    @GetMapping("/{id}") public Patient get(@PathVariable Long id) { return patientService.get(id); }
    @PostMapping public Patient create(@RequestBody Patient p) { return patientService.create(p); }
    @PutMapping("/{id}") public Patient update(@PathVariable Long id, @RequestBody Patient p) { return patientService.update(id, p); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { patientService.delete(id); }
}