package com.zubair.graphql.demo.resolver;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;
import com.zubair.graphql.demo.codegen.types.DepartmentInput;
import com.zubair.graphql.demo.codegen.types.EmployeeInput;
import com.zubair.graphql.demo.codegen.types.TaskInput;
import com.zubair.graphql.demo.entity.Department;
import com.zubair.graphql.demo.entity.Employee;
import com.zubair.graphql.demo.entity.Task;
import com.zubair.graphql.demo.repo.DepartmentRepository;
import com.zubair.graphql.demo.repo.EmployeeRepository;
import com.zubair.graphql.demo.repo.TaskRepository;

@DgsComponent
public class MutationResolver {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final TaskRepository taskRepository;

    public MutationResolver(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, TaskRepository taskRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.taskRepository = taskRepository;
    }

    @DgsMutation
    public Department createDepartment(@InputArgument DepartmentInput input) {
        Department department = new Department();
        department.setName(input.getName());
        return departmentRepository.save(department);
    }

    @DgsMutation
    public Employee createEmployee(EmployeeInput input) {
        Department department = departmentRepository.findById(Long.valueOf(input.getDepartmentId())).orElseThrow();
        Employee employee = new Employee();
        employee.setName(input.getName());
        employee.setPosition(input.getPosition());
        employee.setDepartment(department);
        return employeeRepository.save(employee);
    }

    @DgsMutation
    public Task createTask(TaskInput input) {
        Employee employee = employeeRepository.findById(Long.valueOf(input.getEmployeeId())).orElseThrow();
        Task task = new Task();
        task.setDescription(input.getDescription());
        task.setEmployee(employee);
        return taskRepository.save(task);
    }
}

