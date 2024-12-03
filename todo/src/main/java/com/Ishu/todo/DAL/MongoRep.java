package com.Ishu.todo.DAL;

import com.Ishu.todo.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface MongoRep extends MongoRepository<Todo,String> {
}
