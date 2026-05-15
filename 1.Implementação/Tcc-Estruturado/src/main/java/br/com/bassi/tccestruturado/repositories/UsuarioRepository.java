package br.com.bassi.tccestruturado.repositories;

import br.com.bassi.tccestruturado.domain.Usuario;
import br.com.bassi.tccestruturado.domain.enuns.EnumCargos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByCpf(String cpf);
    List<Usuario> findByCargo(EnumCargos cargo);
    List<Usuario> findByCargoNot(EnumCargos cargo);
    boolean existsByEmail(String email);

    boolean existsByCpf(@NotBlank(message = "O CPF é obrigatório.") @Pattern(regexp = "\\d{11}", message = "O CPF deve conter 11 dígitos numéricos.") String cpf);

    boolean existsByEmailAndIdNot(String email, Long id);
    boolean existsByCpfAndIdNot(String cpf, Long id);
    
}
