package com.hospitalmanagement.hospital_management.repos;

import com.hospitalmanagement.hospital_management.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StaffRepository extends JpaRepository<Staff, Long> {
    List<Staff> findByDepartmentId(Long id);
}
