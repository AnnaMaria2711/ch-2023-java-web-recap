package com.example.ch2023javawebrecap;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("ToDos")
public record ToDo(
        String id,
        String description,
        String status

) {


}

