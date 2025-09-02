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
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse findUserByUuid(UUID uuid) {
        Optional<Users> userOptional = this.userRepository.findUsersByUuid(uuid);
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
        users.setUuid(UUID.randomUUID());
        Users userSaved = this.userRepository.save(users);
        return UserMapper.toDto(userSaved);
    }

    @Override
    public UserResponse updateUser(UUID uuid, UserRequest user) {
        Users users = UserMapper.toEntity(user);
        users.setUuid(uuid);
        Users updatedUser = this.userRepository.save(users);
        return UserMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUserByUuid(UUID uuid) {
        Optional<Users> user = this.userRepository.findUsersByUuid(uuid);
        if(user.isEmpty()) throw new UserNotFoundException("usuário não encontrado");
        this.userRepository.delete(user.get());
    }
}
