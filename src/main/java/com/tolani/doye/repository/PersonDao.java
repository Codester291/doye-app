package com.tolani.doye.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tolani.doye.model.Person;

public interface PersonDao extends JpaRepository<Person, Long> {
    
}
