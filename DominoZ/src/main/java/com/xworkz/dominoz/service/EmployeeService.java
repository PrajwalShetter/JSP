package com.xworkz.dominoz.service;

import com.xworkz.dominoz.dto.EmployeeDto;
import com.xworkz.dominoz.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    boolean saveEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getEmployees();
    EmployeeDto getEmployeeById(int id);
    List<EmployeeDto> getEmployeeByAge(int age);
    boolean updateEmployee(EmployeeDto employeeDto);
    boolean deleteEmployee(int id);
}
