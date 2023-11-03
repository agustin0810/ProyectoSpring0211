package com.tasks2.tasks2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasks2.tasks2.Entity.Task;
import com.tasks2.tasks2.Repository.TaskRepository;

import jakarta.transaction.Transactional;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    @Transactional
    public Task save (Task task){
        return taskRepository.save(task);
    }
    @Override
    @Transactional
    public List<Task> getAll(){
        return taskRepository.findAll();
    }
    @Override
    @Transactional
    public Task modify (Task task){
        return taskRepository.save(task);
    }
    @Override
    @Transactional
    public void delete (Task task){
        taskRepository.delete(task);
    }
    @Override
    @Transactional
    public Optional<Task> getById (int id){
        return taskRepository.findById(id);
    }
}
