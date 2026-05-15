package br.com.bassi.tccestruturado.repositories;

import br.com.bassi.tccestruturado.domain.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventoRepository extends JpaRepository<Evento,Long> {
    Optional<Evento> findByTitulo(String titulo);
    boolean existsByTitulo(String titulo);

}
