package com.smtg.school.manageschool.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smtg.school.manageschool.model.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer> {
	
	 List<Courses> findByOrderByNameDesc();

}
