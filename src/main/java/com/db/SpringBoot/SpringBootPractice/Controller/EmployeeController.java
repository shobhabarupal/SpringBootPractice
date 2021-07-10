package com.db.SpringBoot.SpringBootPractice.Controller;

import com.db.SpringBoot.SpringBootPractice.Model.Employee;
import com.db.SpringBoot.SpringBootPractice.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public Employee addEmployee(@RequestParam("empId") String empId , @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName){

        return employeeService.createEmployee(empId, firstName , secondName);

    }

    @RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
    public String removeEmployee( @RequestParam("empId") String empId)
    {
        employeeService.deleteEmployee(empId);
        return "Employee removed";
    }



}
