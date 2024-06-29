package com.example.employeedms.services;

import com.example.employeedms.dto.EmployeeDto;

public interface EmployeeService {
  EmployeeDto createEmployee(EmployeeDto employeeDto);
  EmployeeDto getEmployeeById(Long id);
}
