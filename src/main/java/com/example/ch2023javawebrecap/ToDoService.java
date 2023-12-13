package com.example.ch2023javawebrecap;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ToDoService {
    private final ToDoRepo toDoRepo;

    public ToDo addToDo(NewToDo newTaskToDo) {
        ToDo toDo = new ToDo(UUID.randomUUID().toString(), newTaskToDo.description(), newTaskToDo.status());
        return toDoRepo.save(toDo);
    }

    public List<ToDo> getToDos() {
        return toDoRepo.findAll();
    }


    public ToDo getToDo(String id) {
        return toDoRepo.findById(id).orElse(null);
    }

    public ToDo updateToDo(ToDo payload) {
        return toDoRepo.save(payload);
    }

    public void deleteToDo(String id) {
        toDoRepo.deleteById(id);
    }

}
