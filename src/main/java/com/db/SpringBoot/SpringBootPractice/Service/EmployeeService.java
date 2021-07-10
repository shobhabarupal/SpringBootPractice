package com.db.SpringBoot.SpringBootPractice.Service;

import com.db.SpringBoot.SpringBootPractice.Model.Employee;
import com.db.SpringBoot.SpringBootPractice.Model.PermEmployee;
import com.db.SpringBoot.SpringBootPractice.Model.TempEmployee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    public Employee createEmployee(String empId, String firstName, String secondName) {

        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(firstName);
        emp.setSecondName(secondName);

        Optional<List<TempEmployee>> emloyee = Optional.ofNullable(emp.getEmloyee().getTemp());
        if(emloyee.isPresent()){
            return emp;
         }

        return emp;
    }

    public void deleteEmployee(String empId) {
    }
}
