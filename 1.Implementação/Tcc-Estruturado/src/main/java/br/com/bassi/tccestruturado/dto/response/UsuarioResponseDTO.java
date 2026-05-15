package br.com.bassi.tccestruturado.dto.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UsuarioResponseDTO(
        Long id,

        @NotBlank(message = "O nome é obrigatório.")
        String nome,

        @NotBlank(message = "O email é obrigatório.")
        @Email(message = "Informe um email válido.")
        String email,


        @NotBlank(message = "O CPF é obrigatório.")
        @Pattern(regexp = "\\d{11}", message = "O CPF deve conter 11 dígitos numéricos.")
        String cpf

) {}
