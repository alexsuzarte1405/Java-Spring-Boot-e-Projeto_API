package com.example.demo_gravacao_mongodb.controller;

import com.example.demo_gravacao_mongodb.model.Estudante;
import com.example.demo_gravacao_mongodb.repository.EstudanteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    private final EstudanteRepository repository;

    public EstudanteController(EstudanteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Estudante> cadastrar(@RequestBody Estudante dados) {
        Estudante salvo = repository.save(dados);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @GetMapping
    public List<Estudante> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> buscarPorId(@PathVariable String id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudante> atualizar(@PathVariable String id, @RequestBody Estudante dados) {
        return repository.findById(id).map(existente -> {
            existente.setNome(dados.getNome());
            existente.setEmail(dados.getEmail());
            existente.setIdade(dados.getIdade());
            return ResponseEntity.ok(repository.save(existente));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable String id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
