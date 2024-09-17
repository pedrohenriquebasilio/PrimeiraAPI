package com.br.buildandrun.FirsApi.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class FirstApiController {

    private List<String> tasks = new ArrayList<>();

    private ObjectMapper objectMapper;

    public FirstApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    @GetMapping(path = "/tasks")
    public ResponseEntity<String> ListTask() throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
    }

    @PostMapping(path = "/tasks")
    public ResponseEntity<Void> createTask(@RequestBody String task){
        tasks.add(task);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/tasks")

    public ResponseEntity<Void> deleteTask(){
        tasks = new ArrayList<>();
        return ResponseEntity.ok().build();
    }
}
