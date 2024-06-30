package com.example.employeedms.services;

import com.example.employeedms.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
  EmployeeDto createEmployee(EmployeeDto employeeDto);
  EmployeeDto getEmployeeById(Long id);
  List<EmployeeDto> getAllEmployees();
}
