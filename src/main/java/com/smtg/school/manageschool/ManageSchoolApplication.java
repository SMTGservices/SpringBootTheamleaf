package com.smtg.school.manageschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.smtg.school.manageschool.model")
@EnableJpaRepositories("com.smtg.school.manageschool.repository")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@SpringBootApplication
public class ManageSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageSchoolApplication.class, args);
	}

}
