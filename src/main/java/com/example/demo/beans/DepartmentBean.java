package com.example.demo.beans;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class DepartmentBean {

    private String name;
    private String code;
    private List<EmployeeBean> employees;
    
}
