package com.smtg.school.manageschool.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smtg.school.manageschool.model.Classe;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Integer> {

}
