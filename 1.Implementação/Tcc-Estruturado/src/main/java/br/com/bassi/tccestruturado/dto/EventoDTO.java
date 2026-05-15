package br.com.bassi.tccestruturado.dto;

import br.com.bassi.tccestruturado.domain.enuns.EnumEstadoEvento;
import br.com.bassi.tccestruturado.domain.enuns.EnumTipoEvento;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record EventoDTO(

        Long localId,

        @NotNull(message = "O evento precisa ter um estado.")
        EnumEstadoEvento estadoEvento,

        @NotNull(message = "O evento precisa ter um tipo.")
        EnumTipoEvento tipoEvento,

        @NotNull(message = "O evento precisa ter uma data.")
        Date data,

        @NotBlank(message = "O evento precisa de um título")
        String titulo,


        String descricao,

        @NotNull(message = "O evento precisa ter uma quantidade de vagas.")
        @Min(value = 1, message = "O número de vagas deve ser maior que zero.")
        Integer vagas,

        Long palestranteId) {
}
