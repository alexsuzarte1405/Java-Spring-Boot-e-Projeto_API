package com.example.demo_gravacao_mongodb.controller;

import com.example.demo_gravacao_mongodb.model.Professor;
import com.example.demo_gravacao_mongodb.repository.ProfessorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    private final ProfessorRepository repository;

    public ProfessorController(ProfessorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Professor> cadastrar(@RequestBody Professor dados) {
        Professor salvo = repository.save(dados);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @GetMapping
    public List<Professor> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> buscarPorId(@PathVariable String id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Professor> atualizar(@PathVariable String id, @RequestBody Professor dados) {
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
