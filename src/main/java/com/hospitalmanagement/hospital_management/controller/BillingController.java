package com.hospitalmanagement.hospital_management.controller;

import com.hospitalmanagement.hospital_management.domain.Billing;
import com.hospitalmanagement.hospital_management.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/billing")
public class BillingController {
    @Autowired private BillingService service;

    @PostMapping public Billing create(@RequestBody Billing b) { return service.create(b); }
    @GetMapping("/patient/{patientId}") public List<Billing> byPatient(@PathVariable Long patientId) { return service.getByPatient(patientId); }
    @PutMapping("/{id}/status") public Billing updateStatus(@PathVariable Long id, @RequestParam String status) { return service.updateStatus(id, status); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}