package com.db.SpringBoot.SpringBootPractice;


import com.db.SpringBoot.SpringBootPractice.Model.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {


    @Before(value="execution(* com.db.SpringBoot.SpringBootPractice.Service.EmployeeService.*(..)) and args(empId, firstName , lastName)")
    public void beforeAdvice(JoinPoint joinPoint , String empId , String firstName , String lastName){
        System.out.println("Before method " + joinPoint.getSignature());
        System.out.println("Creating Employee with first name - " + firstName + ", second name - " + lastName + " and id - " + empId);

    }


}
