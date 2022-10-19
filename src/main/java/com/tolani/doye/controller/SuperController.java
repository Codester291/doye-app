package com.tolani.doye.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperController {
    
    @GetMapping
    public Map<String, Object> displayUser() {
        Map<String, Object> person = new HashMap<>();
        
        person.put("name", "Emmanuel");
        person.put("age", 25);
        person.put("occupation", "Cloud Expert");

        return person;
    }

}
