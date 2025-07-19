package com.hospitalmanagement.hospital_management.repos;

import com.hospitalmanagement.hospital_management.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
