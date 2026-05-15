package br.com.bassi.tccestruturado.controller;

import br.com.bassi.tccestruturado.domain.Evento;
import br.com.bassi.tccestruturado.dto.ParticipacaoEventoDTO;
import br.com.bassi.tccestruturado.dto.FuncionarioDTO;
import br.com.bassi.tccestruturado.service.ParticipacaoEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/participacoes")
@RequiredArgsConstructor
public class ParticipacaoEventoController {

    private final ParticipacaoEventoService participacaoEventoService;

    @PostMapping
    public ResponseEntity<Void> participarDoEvento(@RequestBody ParticipacaoEventoDTO dto) {
        participacaoEventoService.adicionarParticipante(dto);
        return ResponseEntity.ok().build();
    }

    @PreAuthorize("!hasAuthority('VISITANTE')")
    @GetMapping("/evento/{eventoId}/usuarios")
    public ResponseEntity<List<FuncionarioDTO>> listarUsuariosDoEvento(@PathVariable Long eventoId) {
        List<FuncionarioDTO> usuarios = participacaoEventoService.listarUsuariosPorEvento(eventoId);
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/meus-eventos")
    public ResponseEntity<List<Evento>> listarEventosDoUsuarioLogado() {
        List<Evento> eventos = participacaoEventoService.listarEventosDoUsuarioLogado();
        return ResponseEntity.ok(eventos);
    }

}

