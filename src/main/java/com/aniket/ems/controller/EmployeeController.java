package com.aniket.ems.controller;

import com.aniket.ems.dto.EmployeeDto;
import com.aniket.ems.entity.Employee;
import com.aniket.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    //Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
       EmployeeDto savedEmployee =  employeeService.createEmployee(employeeDto);
       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
