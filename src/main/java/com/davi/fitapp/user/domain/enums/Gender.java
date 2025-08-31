package com.davi.fitapp.user.domain.enums;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("male",0), FEMALE("female",1);

    final String title;

    final int code;

    Gender(String title, int code) {
        this.title = title;
        this.code = code;
    }
}
