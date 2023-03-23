package com.demo.SpringBootBackend.repository;

import com.demo.SpringBootBackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{


}
