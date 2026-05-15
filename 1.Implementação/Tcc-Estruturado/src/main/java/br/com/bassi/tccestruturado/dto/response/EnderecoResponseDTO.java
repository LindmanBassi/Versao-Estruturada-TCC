package br.com.bassi.tccestruturado.dto.response;

public record EnderecoResponseDTO(
        String rua,
        String bairro,
        String cidade,
        String estado,
        Integer numero,
        String cep
) {}
