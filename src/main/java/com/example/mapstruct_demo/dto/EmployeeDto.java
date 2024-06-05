package com.example.mapstruct_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {

    private int id;
    private String name;
    private int age;
    private String emailAddress;
    private int projectId;
}
