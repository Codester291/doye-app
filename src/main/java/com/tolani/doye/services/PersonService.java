package com.tolani.doye.services;

import org.springframework.stereotype.Service;

import com.tolani.doye.dto.PersonDTO;
import com.tolani.doye.dto.ResponseDTO;
import com.tolani.doye.model.Person;
import com.tolani.doye.repository.PersonDao;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService {
    
    private final PersonDao personDao;

    public ResponseDTO createPerson(PersonDTO personDTO) {
        Person person = new Person();

        person.setName(personDTO.getName());
        person.setAge(personDTO.getAge());
        person.setOccupation(personDTO.getOccupation());
        person.setSkills(personDTO.getSkills());

        return new ResponseDTO("00", "Success", personDao.save(person));
    }

    public ResponseDTO fetchPersons() {
        return new ResponseDTO("00", "Success", personDao.findAll());
    }

}
