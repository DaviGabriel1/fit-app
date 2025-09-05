package com.davi.fitapp.user.domain.validation;

import com.davi.fitapp.user.domain.enums.Gender;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<ValidGender, Gender> {

    @Override
    public void initialize(ValidGender constraintAnnotation) {
    }

    @Override
    public boolean isValid(Gender gender, ConstraintValidatorContext context) {
        System.out.println("validando");
        if (gender == null) {
            return false;
        }

        try {
            return gender == Gender.MALE || gender == Gender.FEMALE;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
