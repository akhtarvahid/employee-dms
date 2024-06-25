package com.example.employeedms.controllers;

import com.example.employeedms.dto.EmployeeDto;
import com.example.employeedms.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
         System.out.println(employeeDto.getFirstName());
         EmployeeDto employee = employeeService.createEmployee(employeeDto);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
}

