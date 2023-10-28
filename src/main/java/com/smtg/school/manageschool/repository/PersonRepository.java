package com.smtg.school.manageschool.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smtg.school.manageschool.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person readByEmail(String email);

}
