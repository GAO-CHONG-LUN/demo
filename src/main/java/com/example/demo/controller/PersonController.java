package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/yes",method = RequestMethod.GET)
    public List<Person> getPersons(){
        List<Person> personList = personService.getAllPerson();
        return personList;

    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Optional<Person> getPerson(@PathVariable Long id){
        Optional<Person> person = personService.getPersonById(id);
        return person;
    }
//    @RequestMapping(method = RequestMethod.GET)
//    public Optional<Person> autoGet(@RequestParam(value = "id",required = true) Long id){
//        Optional<Person> person =  personRepository.findById(id);
//        return person;
//
//    }
//    @RequestMapping(value = "/getperson",method = RequestMethod.POST)
//    public Person putPerson(@RequestBody Person person){
//        return personRepository.save(person);
//    }
}
