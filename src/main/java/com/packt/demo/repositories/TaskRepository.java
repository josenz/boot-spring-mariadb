package com.packt.demo.repositories;

import com.packt.demo.domain.Task;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
    
}