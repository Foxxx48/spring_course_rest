package com.fox.spring.rest.controller;

import com.fox.spring.rest.entity.Employee;
import com.fox.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
@EnableWebMvc
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping ("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees;
        allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }
    @GetMapping ("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        return employee;
    }
}
