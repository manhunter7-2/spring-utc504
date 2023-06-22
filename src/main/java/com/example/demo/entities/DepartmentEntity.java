package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Department")
public class DepartmentEntity {
    
    @Id
    private Integer id;

    @Column(name="name", length=32, nullable=false)
    private String name;

    @Column(name = "code", length=32, nullable=false)
    private String code;

    @ManyToMany
    @JoinTable(
        name = "emp_dep",
        joinColumns = @JoinColumn(name="Department.id"),
        inverseJoinColumns = @JoinColumn(name="Employee.id")
    )
    private List<EmployeeEntity> employees;
}
