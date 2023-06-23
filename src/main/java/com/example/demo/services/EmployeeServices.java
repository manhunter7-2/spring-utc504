package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;

public class EmployeeServices {

    @Autowired
    EmployeeRepository empRepo;

    private void createEmployee(EmployeeEntity emp){
        
    }
}
