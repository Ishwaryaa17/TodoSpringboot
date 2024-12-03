package com.Ishu.todo.service;


import com.Ishu.todo.DAL.DbRepository;
import com.Ishu.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class TodoService {
    @Autowired
    private DbRepository  DbRepository;

    public List<Todo>getAllTodo() {
        return DbRepository.gettodo();
    }
    public Todo createTodo(Todo todo) {
        return DbRepository.createTodo(todo);
    }
    public Todo updateTodo(String id, Todo NewTodo) {
        return DbRepository.updateTodo(id,NewTodo);
    }
    public void deleteTodoById(String id) {
         DbRepository.deleteById(id);
    }

}
