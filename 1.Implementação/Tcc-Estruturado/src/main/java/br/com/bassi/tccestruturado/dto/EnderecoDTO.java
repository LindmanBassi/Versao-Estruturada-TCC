package br.com.bassi.tccestruturado.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record EnderecoDTO(
        @NotBlank(message = "O CEP é obrigatório.")
        @Pattern(regexp = "\\d{5}-?\\d{3}", message = "O CEP deve estar no formato 00000-000.")
        String cep,

        @NotNull(message = "O número é obrigatório.")
        Integer numero
) {}
