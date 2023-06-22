package com.example.demo.beans;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EmployeeBean {
    private String name;
    private String empNum;
    private Date hireDate;
    List<DepartmentBean> departments;
}
