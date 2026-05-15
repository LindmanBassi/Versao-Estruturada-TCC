package br.com.bassi.tccestruturado.repositories;

import br.com.bassi.tccestruturado.domain.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalRepository extends JpaRepository<Local,Long> {
    boolean existsByNome(String nome);
}
