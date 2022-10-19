package com.tolani.doye.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDTO {
    
    private String name;
    private int age;
    private String occupation;
    private List<String> skills;
    
}
