package com.hospitalmanagement.hospital_management.controller;

import com.hospitalmanagement.hospital_management.domain.MedicalRecord;
import com.hospitalmanagement.hospital_management.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/records")
public class MedicalRecordController {
    @Autowired private MedicalRecordService service;

    @PostMapping public MedicalRecord add(@RequestBody MedicalRecord r) { return service.add(r); }
    @GetMapping("/patient/{patientId}") public List<MedicalRecord> byPatient(@PathVariable Long patientId) { return service.getByPatient(patientId); }
    @PutMapping("/{id}") public MedicalRecord update(@PathVariable Long id, @RequestBody MedicalRecord r) { return service.update(id, r); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}