package com.davi.fitapp.user.domain.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GenderValidator.class)
@Documented
public @interface ValidGender {
    String message() default "Gênero inválido. Use: MALE ou FEMALE";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
