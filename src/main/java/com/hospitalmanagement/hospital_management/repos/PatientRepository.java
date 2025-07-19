package com.hospitalmanagement.hospital_management.repos;

import com.hospitalmanagement.hospital_management.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Long> {
}
