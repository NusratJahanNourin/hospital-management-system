package com.hospitalmanagement.hospital_management.controller;

import com.hospitalmanagement.hospital_management.domain.Department;
import com.hospitalmanagement.hospital_management.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired private DepartmentService service;

    @GetMapping public List<Department> all() { return service.getAll(); }
    @GetMapping("/{id}") public Department get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Department create(@RequestBody Department d) { return service.create(d); }
    @PutMapping("/{id}") public Department update(@PathVariable Long id, @RequestBody Department d) { return service.update(id, d); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}