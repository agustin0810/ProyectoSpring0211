package com.tasks2.tasks2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasks2.tasks2.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{
    
}
