package com.davi.fitapp.user.domain.dtos;

import com.davi.fitapp.user.domain.enums.Gender;
import com.davi.fitapp.user.domain.validation.ValidGender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record UserRequest(
        @NotBlank(message = "o nome é obrigatório")
        String name,
        @Email(message = "email inválido")
        @NotBlank
        String email,
        @NotBlank(message = "o nome é obrigatório")
        @Length(min = 8, message = "a senha deve ter no minimo 8 caracteres")
        String password,
        @NotNull(message = "a idade é obrigatória para o calculo de calorias")
        Integer age,
        @NotNull(message = "a altura é obrigatória para o calculo de calorias")
        Double height,
        @NotNull(message = "o gênero é obrigatório para o calculo de calorias")
        @ValidGender
        Gender gender
) {
}
