package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //this is not required Spring knows already
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
