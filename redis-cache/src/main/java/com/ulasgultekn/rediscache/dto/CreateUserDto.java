package com.ulasgultekn.rediscache.dto;

import com.ulasgultekn.rediscache.entities.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDto {
    private String username;
    private String password;


    public User toEntity(CreateUserDto createUserDto){
        return User.builder()
                .username(createUserDto.getUsername())
                .password(createUserDto.getPassword())
                .build();
    }
}
