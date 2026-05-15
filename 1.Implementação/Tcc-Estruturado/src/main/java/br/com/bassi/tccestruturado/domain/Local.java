package br.com.bassi.tccestruturado.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Local")
@Table(name = "locais")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer capacidade;

    @Embedded
    private Endereco endereco;


}

