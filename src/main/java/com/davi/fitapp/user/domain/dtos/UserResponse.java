package com.davi.fitapp.user.domain.dtos;

import com.davi.fitapp.user.domain.enums.Gender;

public record UserResponse(
        Long id,
        String name,
        String email,
        int age,
        double height,
        Gender gender
) { }
