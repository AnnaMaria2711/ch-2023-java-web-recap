package com.example.ch2023javawebrecap;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class Controller {


    private final ToDoService toDoService;

    @PostMapping("/api/todo")
    public ToDo postToDo(@RequestBody NewToDo taskToDo) {
        return toDoService.addToDo(taskToDo);
    }

    @GetMapping("/api/todo")
    public List<ToDo> getToDos() {
        return toDoService.getToDos();
    }

    @GetMapping("/api/todo/{id}")
    public ToDo getToDo(@PathVariable String id) {
        return toDoService.getToDo(id);

    }

    @PutMapping("/api/todo/{id}")
    public ToDo updateToDo(@RequestBody ToDo payload) {
        return toDoService.updateToDo(payload);
    }

    @DeleteMapping("/api/todo/{id}")
    public void deleteToDo(@PathVariable String id) {
        toDoService.deleteToDo(id);

    }

}


