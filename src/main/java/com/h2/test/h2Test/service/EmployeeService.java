package com.h2.test.h2Test.service;

import com.h2.test.h2Test.employee.Employee;
import com.h2.test.h2Test.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee()
    {
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(employee -> listOfEmployee.add(employee));
        return listOfEmployee;
    }

    public Employee saveOrUpdateEmployee(Employee employee)
    {
        employeeRepository.save(employee);
        return employee;
    }

    public Optional<Employee> findEmployeeById(Integer id)
    {
        return employeeRepository.findById(id);


    }

    public Employee deleteEmployee(Integer id)
    {
        Employee employee = employeeRepository.findById(id).get();
        employeeRepository.deleteById(id);
        return employee;
    }
}
