package com.tasks2.tasks2.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tasks2.tasks2.Entity.Task;
import com.tasks2.tasks2.Service.TaskService;


@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<?> addTask(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.save(task));
    }

    @GetMapping
    public ResponseEntity<?> listAll(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(taskService.getAll());
    }

    @PutMapping
    public ResponseEntity<?> modify(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(taskService.modify(task));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Task task){
        taskService.delete(task);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Tarea eliminada con éxito");
    }

    @GetMapping("/{id}") // Se llama con /tasks/1
    public ResponseEntity<?> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getById(id));
    }

}
