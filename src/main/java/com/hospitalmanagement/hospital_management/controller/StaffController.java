package com.hospitalmanagement.hospital_management.controller;

import com.hospitalmanagement.hospital_management.domain.Staff;
import com.hospitalmanagement.hospital_management.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    @Autowired private StaffService service;

    @GetMapping public List<Staff> all() { return service.getAll(); }
    @PostMapping public Staff create(@RequestBody Staff s) { return service.create(s); }
    @GetMapping("/department/{departmentId}") public List<Staff> byDepartment(@PathVariable Long departmentId) { return service.getByDepartment(departmentId); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}