package com.example.mapstruct_demo.service.impl;

import com.example.mapstruct_demo.dto.EmployeeDto;
import com.example.mapstruct_demo.entity.Employee;
import com.example.mapstruct_demo.mapper.EmployeePopulater;
import com.example.mapstruct_demo.repository.EmployeeRepository;
import com.example.mapstruct_demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeePopulater.INSTANCE.populateEmployee(employeeDto);
        employee.setCreationDate(new Date());
        return employeeRepository.save(employee);
    }
}
