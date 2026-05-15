package br.com.bassi.tccestruturado.dto.response;

import br.com.bassi.tccestruturado.domain.enuns.EnumEstadoEvento;
import br.com.bassi.tccestruturado.domain.enuns.EnumTipoEvento;
import java.util.Date;

public record EventoResponseDTO(
        Long id,
        Long localId,
        EnumEstadoEvento estadoEvento,
        EnumTipoEvento tipoEvento,
        Date data,
        String titulo,
        String descricao,
        int vagas,
        Long palestranteId
) {}
