package com.example.demo.service;

import com.example.demo.entity.Person;
import java.util.List;
import java.util.Optional;

public interface PersonFunction {
    Optional<Person> getPersonById(Long id);
    List<Person> getAllPerson();

 }
