package com.Ishu.todo.Controller;

import com.Ishu.todo.model.Todo;
import com.Ishu.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService service;

    // Get all todos
    @GetMapping
    public List<Todo> getAllTodo() {
        return service.getAllTodo();
    }

    // Create a new todo (no {id} in the path)
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return service.createTodo(todo);
    }

    // Update an existing todo
    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable String id, @RequestBody Todo newTodo) {
        return service.updateTodo(id, newTodo);
    }

    // Delete a todo by id
    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable String id) {
        service.deleteTodoById(id);
    }
}
