package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.api.UserApi;
import org.example.exception.UserNotFoundException;
import org.example.model.UserData;
import org.example.model.dto.UserDTO;
import org.example.service.api.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserService service;
    
    @Override
    public ResponseEntity<Void> addUser(UserDTO user) {
        service.addUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<UserData> getUser(Long id) throws UserNotFoundException {
        return ResponseEntity.ok(service.getUser(id));
    }

    @Override
    public ResponseEntity<List<UserData>> getAllUser() {
        return ResponseEntity.ok(service.getAllUser());
    }

    @Override
    public ResponseEntity<Void> deleteUser(Long id) throws UserNotFoundException {
        service.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
