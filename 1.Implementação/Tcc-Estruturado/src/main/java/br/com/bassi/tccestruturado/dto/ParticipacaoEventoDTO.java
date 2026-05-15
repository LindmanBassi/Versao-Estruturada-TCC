package br.com.bassi.tccestruturado.dto;

import jakarta.validation.constraints.NotBlank;

public record ParticipacaoEventoDTO(

        @NotBlank(message = "O título do evento é obrigatório.")
        String tituloEvento) {}



