package com.tolani.doye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolani.doye.dto.PersonDTO;
import com.tolani.doye.dto.ResponseDTO;
import com.tolani.doye.services.PersonService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/person")
public class PersonController {
    
    private final PersonService personService;

    @PostMapping
    public ResponseDTO createPerson(@RequestBody PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }

    @GetMapping
    public ResponseDTO fetchPersons() {
        return personService.fetchPersons();
    }
}
