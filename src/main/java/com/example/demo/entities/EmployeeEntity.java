package com.example.demo.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "Employee")
public class EmployeeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, 
    generator="employeeid_generator")
    private Integer id;

    @Column(name="name", length=32, nullable=false)
    private String name;

    @Column(name = "empNum", length=32, nullable=false)
    private String empNum;

    @Temporal(TemporalType.DATE)
    @Column(name = "hireDate")
    private Date hireDate;

    @ManyToMany
    @JoinTable(name="emp_dep",
    joinColumns = @JoinColumn(name="Employee.id"),
    inverseJoinColumns = @JoinColumn(name="Department.id"))
    List<DepartmentEntity> departments;
}
