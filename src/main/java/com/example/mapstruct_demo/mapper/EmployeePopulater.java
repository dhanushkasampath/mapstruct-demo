package com.example.mapstruct_demo.mapper;

import com.example.mapstruct_demo.dto.EmployeeDto;
import com.example.mapstruct_demo.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeePopulater {

    EmployeePopulater INSTANCE = Mappers.getMapper(EmployeePopulater.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creationDate", ignore = true)
    Employee populateEmployee(EmployeeDto employeeDto);
}
