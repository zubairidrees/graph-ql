package com.zubair.graphql.demo.repo;

import com.zubair.graphql.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}