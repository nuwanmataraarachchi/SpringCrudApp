package com.example.simpleytcrud.service;

import com.example.simpleytcrud.model.Employee;
import com.example.simpleytcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(int empId) {
        return employeeRepository.findById(empId);

    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int empId) {
        employeeRepository.deleteById(empId);

    }
}
