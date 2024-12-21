package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.exception.UserNotFoundException;
import org.example.mapper.UserMapper;
import org.example.model.UserData;
import org.example.model.dto.UserDTO;
import org.example.repository.UserRepository;
import org.example.service.api.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;
    private final PasswordEncoder passwordEncoder;


    @Override
    @Transactional
    public void addUser(UserDTO user) {
        UserData userData = mapper.map(user);
        userData.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(userData);
    }

    @Override
    @Transactional(readOnly = true)
    public UserData getUser(Long id) throws UserNotFoundException {
        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public List<UserData> getAllUser() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteUser(Long id) throws UserNotFoundException {
        UserData userData = getUser(id);
        repository.delete(userData);
    }
}
