package com.smtg.school.manageschool.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smtg.school.manageschool.model.Person;
import com.smtg.school.manageschool.repository.PersonRepository;

import jakarta.servlet.http.HttpSession;


@Controller
public class DashboardController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/dashboard")
    public String displayDashboard(Model model,Authentication authentication, HttpSession session) {
        Person person = personRepository.readByEmail(authentication.getName());
        model.addAttribute("username", person.getName());
        model.addAttribute("roles", authentication.getAuthorities().toString());
        session.setAttribute("loggedInPerson", person);
        return "dashboard.html";
    }

}
