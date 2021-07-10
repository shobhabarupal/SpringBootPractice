package com.db.SpringBoot.SpringBootPractice.Model;

import java.util.List;

public class Employee {

    private String empId;
    private String firstName;
    private String secondName;


    public PermEmployee getEmloyee() {
        return emloyee;
    }

    public void setEmloyee(PermEmployee emloyee) {
        this.emloyee = emloyee;
    }

    private PermEmployee emloyee;

    public Employee(){

    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
