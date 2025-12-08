package com.employeecicd.deployement.service;

import com.employeecicd.deployement.entity.Employee;
import com.employeecicd.deployement.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
