package com.aniket.ems.service.impl;

import com.aniket.ems.dto.EmployeeDto;
import com.aniket.ems.entity.Employee;
import com.aniket.ems.mapper.EmployeeMapper;
import com.aniket.ems.repository.EmployeeRepository;
import com.aniket.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
