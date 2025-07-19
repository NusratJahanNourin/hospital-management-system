package com.hospitalmanagement.hospital_management.service;

import com.hospitalmanagement.hospital_management.domain.MedicalRecord;
import com.hospitalmanagement.hospital_management.repos.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicalRecordService {
    @Autowired private MedicalRecordRepository repo;
    public MedicalRecord add(MedicalRecord r) { return repo.save(r); }
    public List<MedicalRecord> getByPatient(Long id) { return repo.findByPatientId(id); }
    public MedicalRecord update(Long id, MedicalRecord r) {
        r.setRecordId(id);
        return repo.save(r);
    }
    public void delete(Long id) { repo.deleteById(id); }
}