package com.neo4j.crud.service.api.transformer;

import com.neo4j.crud.service.api.dto.UserDTO;
import com.neo4j.crud.service.db.entity.User;

public class UserTransformer {
    
    public static User transform(UserDTO userDTO) {
        return User.builder()
                .firstname(userDTO.getFirstname())
                .secondname(userDTO.getSecondname())
                .lastname(userDTO.getLastname())
                .build();
    }
    
    public static UserDTO transform(User user) {
        return UserDTO.builder()
                .firstname(user.getFirstname())
                .secondname(user.getSecondname())
                .lastname(user.getLastname())
                .build();
    }

}
