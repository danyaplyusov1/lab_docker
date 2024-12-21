package org.example.controller.api;

import org.example.exception.UserNotFoundException;
import org.example.model.UserData;
import org.example.model.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public interface UserApi {

    @PostMapping("/add")
    ResponseEntity<Void> addUser(@RequestBody UserDTO user);

    @GetMapping("/{id}")
    ResponseEntity<UserData> getUser(@PathVariable Long id) throws UserNotFoundException;

    @GetMapping("/")
    ResponseEntity<List<UserData>> getAllUser();

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteUser(@PathVariable Long id) throws UserNotFoundException;
}
