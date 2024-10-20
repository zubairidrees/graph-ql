package com.zubair.graphql.demo.repo;

import com.zubair.graphql.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {}
