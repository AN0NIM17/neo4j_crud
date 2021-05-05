package com.neo4j.crud.service.db.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.crud.service.db.entity.User;

public interface UserRepository extends Neo4jRepository<User, Long>{

    public User findByFirstname(String firstname); 
}
