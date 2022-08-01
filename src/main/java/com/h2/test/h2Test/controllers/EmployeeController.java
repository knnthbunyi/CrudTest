package com.h2.test.h2Test.controllers;

import com.h2.test.h2Test.service.EmployeeService;
import com.h2.test.h2Test.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeController {

    @Autowired private EmployeeService employeeService;

    @GetMapping("/employee")
    private List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/employee/")
    @ResponseBody
    public Optional<Employee> getEmployeeById(@RequestParam Integer id) {
        return employeeService.findEmployeeById(id);
    }

    @PostMapping("/employee")
    @ResponseBody
    private Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveOrUpdateEmployee(employee);
    }

    @DeleteMapping("/employee/")
    @ResponseBody
    private Employee deleteEmployee(@RequestParam("id") Integer id)
    {
        return employeeService.deleteEmployee(id);
    }

}
