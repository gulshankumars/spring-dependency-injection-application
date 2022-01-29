package com.sunglowsys.test;

import com.sunglowsys.configuration.JavaConfig;
import com.sunglowsys.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee = (Employee) context.getBean(Employee.class);
        System.out.println();
        employee.setFirstName("Gulshan");


        System.out.println("Employee Name :" + employee.getFirstName());
        System.out.println();
        employee.newAddress();
    }
}
