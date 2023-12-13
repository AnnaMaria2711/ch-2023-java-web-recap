package com.example.ch2023javawebrecap;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoRepo extends MongoRepository<ToDo, String> {


}

