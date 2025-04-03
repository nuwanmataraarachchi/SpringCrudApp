package com.example.simpleytcrud.controller;

import com.example.simpleytcrud.exception.RecordNotFoundException;
import com.example.simpleytcrud.model.Employee;
import com.example.simpleytcrud.service.EmployeeService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.save(employee));

    }

    @GetMapping("/findById/{empId}")
    public ResponseEntity<Optional<Employee>> findById(@PathVariable Integer empId){
        return ResponseEntity.ok(employeeService.findById(empId));

    }
    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.findAll());

    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<Employee> update (@PathVariable Integer empId, @RequestBody Employee employee){
        // custom
        Employee employee1 = employeeService.findById(empId).orElseThrow(()-> new RecordNotFoundException("Employee ID Do Not Exist"));
        employee1.setEmplName(employee.getEmplName());
        employee1.setEmpSalary(employee.getEmpSalary());
        return ResponseEntity.ok(employeeService.update(employee1));



    }
    @DeleteMapping("/deletebyId/{empId}")
    public ResponseEntity<String> deleteById (@PathVariable Integer empId){
        employeeService.deleteById((empId));

        return ResponseEntity.ok("Deleted Succesfully");

    }



}
