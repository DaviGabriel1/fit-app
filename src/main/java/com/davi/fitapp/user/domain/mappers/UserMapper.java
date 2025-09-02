package com.davi.fitapp.user.domain.mappers;

import com.davi.fitapp.user.domain.dtos.UserRequest;
import com.davi.fitapp.user.domain.dtos.UserResponse;
import com.davi.fitapp.user.domain.models.Users;

public class UserMapper {

    public static UserResponse toDto(Users users) {
        return new UserResponse(
                users.getUuid().toString(),
                users.getName(),
                users.getEmail(),
                users.getAge(),
                users.getHeight(),
                users.getGender()
        );
    }

    public static Users toEntity(UserRequest userRequest) {
        return new Users(
                userRequest.name(),
                userRequest.email(),
                userRequest.password(),
                userRequest.age(),
                userRequest.height(),
                userRequest.gender()
        );
    }
}
