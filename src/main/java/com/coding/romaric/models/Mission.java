package com.coding.romaric.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Mission {

    @Id
    @GeneratedValue
    private Integer id;

    private String missionName;

    private int duration;

    @ManyToMany(mappedBy = "missions")
    private List<Employee> employees;
}
