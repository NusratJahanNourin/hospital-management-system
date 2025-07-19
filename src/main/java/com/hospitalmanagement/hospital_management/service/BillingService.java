package com.hospitalmanagement.hospital_management.service;

import com.hospitalmanagement.hospital_management.domain.Billing;
import com.hospitalmanagement.hospital_management.repos.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BillingService {
    @Autowired private BillingRepository repo;
    public Billing create(Billing b) { return repo.save(b); }
    public List<Billing> getByPatient(Long id) { return repo.findByPatientId(id); }
    public Billing updateStatus(Long id, String status) {
        Billing b = repo.findById(id).orElseThrow();
        b.setPaymentStatus(status);
        return repo.save(b);
    }
    public void delete(Long id) { repo.deleteById(id); }
}