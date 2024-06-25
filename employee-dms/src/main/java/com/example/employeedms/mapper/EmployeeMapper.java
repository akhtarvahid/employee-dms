package com.example.employeedms.mapper;

import com.example.employeedms.dto.EmployeeDto;
import com.example.employeedms.entities.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
       return new EmployeeDto(
               employee.getId(),
               employee.getFirstName(),
               employee.getLastName(),
               employee.getEmail(),
               employee.getPhone(),
               employee.getRole()
       );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getPhone(),
                employeeDto.getRole()
        );
    }
}
