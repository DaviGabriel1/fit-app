package com.davi.fitapp.user.domain.services;

import com.davi.fitapp.user.domain.dtos.UserProfilesRequest;
import com.davi.fitapp.user.domain.dtos.UserProfilesResponse;
import com.davi.fitapp.user.domain.dtos.UserRequest;
import com.davi.fitapp.user.domain.dtos.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserResponse findUserByUuid(UUID uuid);
    List<UserResponse> findAllUsers(int limit, int page);
    UserResponse createUser(UserRequest user);
    UserResponse updateUser(UUID uuid, UserRequest user);
    void deleteUserByUuid(UUID uuid);
    //profile
    UserProfilesResponse saveUserProfile(UUID userUuid, UserProfilesRequest userProfilesRequest);
    UserProfilesResponse updateUserProfile(UUID userUuid, UserProfilesRequest userProfilesRequest);
    UserProfilesResponse findUserProfile(UUID userUuid);
}
