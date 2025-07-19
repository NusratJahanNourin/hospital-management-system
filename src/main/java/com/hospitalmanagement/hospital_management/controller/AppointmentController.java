package com.hospitalmanagement.hospital_management.controller;

import com.hospitalmanagement.hospital_management.domain.Appointment;
import com.hospitalmanagement.hospital_management.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    @Autowired private AppointmentService service;

    @GetMapping public List<Appointment> all() { return service.getAll(); }
    @PostMapping public Appointment create(@RequestBody Appointment a) { return service.create(a); }
    @GetMapping("/patient/{patientId}") public List<Appointment> byPatient(@PathVariable Long patientId) { return service.getByPatient(patientId); }
    @GetMapping("/doctor/{doctorId}") public List<Appointment> byDoctor(@PathVariable Long doctorId) { return service.getByDoctor(doctorId); }
    @PutMapping("/{id}/status") public Appointment updateStatus(@PathVariable Long id, @RequestParam String status) {
        return service.updateStatus(id, status);
    }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}