package com.example.simpleytcrud.service;

import com.example.simpleytcrud.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee save(Employee employee);

    Optional<Employee> findById (int empId);
    List<Employee> findAll();

    Employee update(Employee employee);

    void deleteById(int empId);




}
