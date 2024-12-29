package com.coding.romaric.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Department {

    @Id
    @GeneratedValue
    private Integer id;

    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
