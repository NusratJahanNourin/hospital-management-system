package com.hospitalmanagement.hospital_management.repos;

import com.hospitalmanagement.hospital_management.domain.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BillingRepository extends JpaRepository<Billing, Long> {
    List<Billing> findByPatientId(Long id);

}
