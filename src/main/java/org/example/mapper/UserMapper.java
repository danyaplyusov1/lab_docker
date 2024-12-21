package org.example.mapper;

import lombok.RequiredArgsConstructor;
import org.example.model.UserData;
import org.example.model.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

    public UserData map(UserDTO userDto) {
        return UserData.builder()
                .username(userDto.getUsername())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
    }
}
