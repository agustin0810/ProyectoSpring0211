package com.tasks2.tasks2.Service;

import java.util.List;
import java.util.Optional;

import com.tasks2.tasks2.Entity.Task;

public interface TaskService {
    public Task save (Task task);
    public List<Task> getAll();
    public Task modify (Task task);
    public void delete (Task task);
    public Optional<Task> getById (int id);
}
