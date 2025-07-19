package com.hospitalmanagement.hospital_management.repos;

import com.hospitalmanagement.hospital_management.domain.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    List<MedicalRecord> findByPatientId(Long id);
}
