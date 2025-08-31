package com.davi.fitapp.user.domain.services.impl;

import com.davi.fitapp.user.domain.dtos.UserRequest;
import com.davi.fitapp.user.domain.dtos.UserResponse;
import com.davi.fitapp.user.domain.exceptions.UserNotFoundException;
import com.davi.fitapp.user.domain.mappers.UserMapper;
import com.davi.fitapp.user.domain.models.Users;
import com.davi.fitapp.user.domain.repositories.UserRepository;
import com.davi.fitapp.user.domain.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse findUserById(Long id) {
        Optional<Users> userOptional = this.userRepository.findById(id);
        if(userOptional.isEmpty()) throw new UserNotFoundException("usuário não encontrado");
        return UserMapper.toDto(userOptional.get());
    }

    @Override
    public List<UserResponse> findAllUsers(int limit, int page) {
        return List.of();
    }

    @Override
    public UserResponse createUser(UserRequest user) {
        Users users = UserMapper.toEntity(user);
        Users userSaved = this.userRepository.save(users);
        return UserMapper.toDto(userSaved);
    }

    @Override
    public UserResponse updateUser(Long id, UserRequest user) {
        Users users = UserMapper.toEntity(user);
        users.setId(id);
        Users updatedUser = this.userRepository.save(users);
        return UserMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUserById(Long id) {
        Optional<Users> user = this.userRepository.findById(id);
        if(user.isEmpty()) throw new UserNotFoundException("usuário não encontrado");
        this.userRepository.delete(user.get());
    }
}
