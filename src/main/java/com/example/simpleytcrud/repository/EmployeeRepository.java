package com.example.simpleytcrud.repository;

import com.example.simpleytcrud.model.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
