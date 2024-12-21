package org.example.service.api;

import org.example.exception.UserNotFoundException;
import org.example.model.UserData;
import org.example.model.dto.UserDTO;

import java.util.List;

public interface UserService {

    void addUser(UserDTO user);

    UserData getUser(Long id) throws UserNotFoundException;

    List<UserData> getAllUser();

    void deleteUser(Long id) throws UserNotFoundException;
}
