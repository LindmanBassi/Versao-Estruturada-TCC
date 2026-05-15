package br.com.bassi.tccestruturado.dto;

import br.com.bassi.tccestruturado.domain.enuns.EnumCargos;
import br.com.bassi.tccestruturado.domain.enuns.EnumDepartamento;
import jakarta.validation.constraints.*;

public record FuncionarioDTO(
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @NotBlank(message = "O email é obrigatório")
        @Email(message = "Informe um email válido.")
        String email,

        @NotBlank(message = "O cpf é obrigatório")
        @Pattern(regexp = "\\d{11}", message = "O CPF deve conter 11 dígitos numéricos.")
        String cpf,

        @NotBlank(message = "A senha é obrigatória")
        @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres.")
        String senha,

        @NotNull(message = "O cargo é obrigatório.")
        EnumCargos cargo,

        @NotNull(message = "O departamento é obrigatório.")
        EnumDepartamento departamento
) {}
