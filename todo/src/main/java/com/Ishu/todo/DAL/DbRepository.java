package com.Ishu.todo.DAL;

import com.Ishu.todo.model.Todo;
import  org.springframework.stereotype.Repository;


import  java.util.List;
import  java.util.Optional;


@Repository
public interface DbRepository {

    List<Todo> gettodo();
    Todo createTodo(Todo todo);
    Todo updateTodo(String id, Todo newTodo);
    void deleteById (String id);
    Optional<Todo> getTodoById(String id);
}