package com.davi.fitapp.user.domain.dtos;

import com.davi.fitapp.user.domain.enums.Gender;

public record UserRequest(
        String name,
        String email,
        String password,
        int age,
        double height,
        Gender gender
) {
}
