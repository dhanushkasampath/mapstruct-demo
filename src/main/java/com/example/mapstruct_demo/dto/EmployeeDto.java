package com.example.mapstruct_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto {

    private int id;
    private String name;
    private int age;
    private String emailAddress;
    private int projectId;
}
