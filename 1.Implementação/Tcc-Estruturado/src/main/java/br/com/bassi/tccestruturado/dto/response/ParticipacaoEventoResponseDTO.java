package br.com.bassi.tccestruturado.dto.response;

import jakarta.validation.constraints.NotBlank;

public record ParticipacaoEventoResponseDTO(
        @NotBlank(message = "O cpf do usuário é obrigatório.")
        String cpfUsuario,

        @NotBlank(message = "O título do evento é obrigatório.")
        String tituloEvento) {}
