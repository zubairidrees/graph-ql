package com.zubair.graphql.demo.repo;

import com.zubair.graphql.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {}