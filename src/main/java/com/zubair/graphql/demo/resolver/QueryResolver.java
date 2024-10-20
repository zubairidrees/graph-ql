package com.zubair.graphql.demo.resolver;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.zubair.graphql.demo.entity.Department;
import com.zubair.graphql.demo.entity.Employee;
import com.zubair.graphql.demo.entity.Task;
import com.zubair.graphql.demo.repo.DepartmentRepository;
import com.zubair.graphql.demo.repo.EmployeeRepository;
import com.zubair.graphql.demo.repo.TaskRepository;

import java.util.List;

@DgsComponent
public class QueryResolver {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final TaskRepository taskRepository;

    public QueryResolver(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, TaskRepository taskRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.taskRepository = taskRepository;
    }

    @DgsQuery
    public List<Department> departments() {
        return departmentRepository.findAll();
    }

    @DgsQuery
    public List<Employee> employees() {
        return employeeRepository.findAll();
    }

    @DgsQuery
    public List<Task> tasks() {
        return taskRepository.findAll();
    }
}

