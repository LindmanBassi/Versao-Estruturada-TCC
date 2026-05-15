package br.com.bassi.tccestruturado.repositories;

import br.com.bassi.tccestruturado.domain.Evento;
import br.com.bassi.tccestruturado.domain.ParticipacaoEvento;
import br.com.bassi.tccestruturado.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ParticipacaoEventoRepository extends JpaRepository<ParticipacaoEvento, Long> {
    int countByEventoId(Evento evento);
    List<ParticipacaoEvento> findByEventoId(Evento evento);

    List<ParticipacaoEvento> findByUsuarioId(Usuario usuario);

}
