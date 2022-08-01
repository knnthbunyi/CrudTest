package com.h2.test.h2Test.repository;

import com.h2.test.h2Test.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {
    Employee findById(String id);
}
