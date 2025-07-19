package com.hospitalmanagement.hospital_management.repos;

import com.hospitalmanagement.hospital_management.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByDepartmentId(Long departmentId);
}
