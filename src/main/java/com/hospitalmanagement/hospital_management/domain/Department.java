package com.hospitalmanagement.hospital_management.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Department {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Long departmentId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column
    private String description;

    @Column(length = 100)
    private String headOfDepartment;

    @Column(length = 100)
    private String contactInfo;

    @OneToMany(mappedBy = "department")
    private Set<Doctor> departmentDoctors = new HashSet<>();

    @OneToMany(mappedBy = "department")
    private Set<Staff> departmentStaffs = new HashSet<>();

}
