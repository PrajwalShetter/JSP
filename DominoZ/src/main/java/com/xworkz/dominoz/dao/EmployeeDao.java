package com.xworkz.dominoz.dao;

import com.xworkz.dominoz.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDao {

    boolean saveEmployee(EmployeeEntity employeeEntity);
    List<EmployeeEntity> getEmployees();
    EmployeeEntity getEmployeeById(int id);
    List<EmployeeEntity> getEmployeeByAge(int age);
    boolean updateEmployee(EmployeeEntity employeeEntity);
    boolean deleteEmployee(int id);
}
