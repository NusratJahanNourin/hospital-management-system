package com.hospitalmanagement.hospital_management.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("com.hospitalmanagement.hospital_management.domain")
@EnableJpaRepositories("com.hospitalmanagement.hospital_management.repos")
@EnableTransactionManagement
public class DomainConfig {
}
