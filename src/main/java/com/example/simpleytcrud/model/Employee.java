package com.example.simpleytcrud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer empID;
    private String emplName;
    private double empSalary;

    public Employee() {
    }

    public Employee(Integer empID, String emplName, double empSalary) {
        this.empID = empID;
        this.emplName = emplName;
        this.empSalary = empSalary;
    }

    public Integer getEmpID() {
        return empID;
    }

    public String getEmplName() {
        return emplName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}
