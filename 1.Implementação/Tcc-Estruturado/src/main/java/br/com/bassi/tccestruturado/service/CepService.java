package br.com.bassi.tccestruturado.service;

import br.com.bassi.tccestruturado.client.CepClient;
import br.com.bassi.tccestruturado.dto.ViaCepResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CepService {
    private final CepClient client;

    public ViaCepResponseDTO buscarPorCep(String cep) {

        return client.getEndereco(cep);
    }
}