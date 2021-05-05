package com.neo4j.crud.service.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo4j.crud.service.api.dto.UserDTO;
import com.neo4j.crud.service.db.entity.User;
import com.neo4j.crud.service.service.UserService;

import lombok.RequiredArgsConstructor;

import static com.neo4j.crud.service.api.transformer.UserTransformer.transform;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CRUDController {

    private final UserService service;
    
    @GetMapping("/get/all")
    public List<User> getAll() {
        return service.getAll();
    }
    
    @GetMapping("/get/{firstname}")
    public User getByFirstname(@PathVariable String firstname) {
        return service.getByFirstname(firstname);
    }
    
    @PostMapping("/save")
    public void save(@RequestBody UserDTO dto) {
        service.save(transform(dto));
    }
    
    @PostMapping("/add/friend/{user1}/to/{user2}")
    public void addFriend(@PathVariable String user1, @PathVariable String user2) {
        service.addFriend(user1, user2);
    }
}
