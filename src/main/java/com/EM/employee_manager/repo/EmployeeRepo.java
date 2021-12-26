package com.EM.employee_manager.repo;

import com.EM.employee_manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*
for JPA repository you need to tell what class this repository is for,
and pass in the type of the primary key of that class
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
