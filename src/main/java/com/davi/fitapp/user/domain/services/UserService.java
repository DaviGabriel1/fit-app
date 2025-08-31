package com.davi.fitapp.user.domain.services;

import com.davi.fitapp.user.domain.dtos.UserRequest;
import com.davi.fitapp.user.domain.dtos.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse findUserById(Long id);
    List<UserResponse> findAllUsers(int limit, int page);
    UserResponse createUser(UserRequest user);
    UserResponse updateUser(Long id, UserRequest user);
    void deleteUserById(Long id);
}
