package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.imp.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements PersonFunction {
    @Autowired
    private PersonRepository personRepository;


    @Override
    public Optional<Person> getPersonById(Long id) {

        Optional<Person> person = this.personRepository.findById(id);

        return person;
    }

    @Override
    public List<Person> getAllPerson() {
        List<Person> personL = this.personRepository.findAll();
        return personL;
    }
}
