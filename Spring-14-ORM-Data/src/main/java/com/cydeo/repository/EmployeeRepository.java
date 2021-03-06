package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Display all employees with email address ''
    List<Employee> findByEmail(String email);

    //Display all employees with first name ' ' and last name ' ' , also show all employees with email address
    List<Employee>findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees that first name is not ' '
    List<Employee>findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ' '
    List<Employee> findByLastNameStartsWith(String pattern);

    //Display all employees with salaries higher than ' '
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ' '
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has been hired between '' and ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater or equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top unique 3 employees that is making less than ''
    List<Employee>findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull(); //parameter not needed since we have to bring all values


    @Query("SELECT e FROM Employee e WHERE e.email = 'bmanueau0@dion.ne.jp'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'bmanueau0@dion.ne.jp'")
    Employee getEmployeeSalary();



}
