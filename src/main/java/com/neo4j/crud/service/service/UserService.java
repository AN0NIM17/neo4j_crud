package com.neo4j.crud.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neo4j.crud.service.db.entity.User;
import com.neo4j.crud.service.db.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }
    
    public User getByFirstname(String firstname) {
        return repository.findByFirstname(firstname);
    }

    public void save(User user) {
        repository.save(user);
    }
    
    public void addFriend(String user, String friend) {
        User friendUser = repository.findByFirstname(friend);
        User findByFirstname = repository.findByFirstname(user);
        findByFirstname.addFriend(friendUser);
        repository.save(findByFirstname);
    }

}
