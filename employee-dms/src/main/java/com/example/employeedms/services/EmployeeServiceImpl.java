package com.example.employeedms.services;

import com.example.employeedms.dto.EmployeeDto;
import com.example.employeedms.entities.Employee;
import com.example.employeedms.mapper.EmployeeMapper;
import com.example.employeedms.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmp =  employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmp);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        return EmployeeMapper.mapToEmployeeDto(employeeRepository.findById(id).orElse(null));
    }
}
