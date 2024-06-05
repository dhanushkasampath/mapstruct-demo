package com.example.mapstruct_demo.service;

import com.example.mapstruct_demo.dto.EmployeeDto;
import com.example.mapstruct_demo.entity.Employee;

public interface EmployeeService {
    Employee saveEmployee(EmployeeDto employeeDto);
}
