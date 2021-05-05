package com.neo4j.crud.service.db.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;
    
    private String firstname;
    private String secondname;
    private String lastname;

    @Relationship(type = "FRIEND")
    private Set<User> friends = new HashSet();
    
    public void addFriend(User user) {
        friends.add(user);
        System.out.println(friends.toString());
    }
}
