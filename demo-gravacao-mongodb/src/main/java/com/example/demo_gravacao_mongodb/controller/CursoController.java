package com.example.demo_gravacao_mongodb.controller;

import com.example.demo_gravacao_mongodb.model.Curso;
import com.example.demo_gravacao_mongodb.repository.CursoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private final CursoRepository repository;

    public CursoController(CursoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Curso> cadastrar(@RequestBody Curso dados) {
        Curso salvo = repository.save(dados);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @GetMapping
    public List<Curso> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscarPorId(@PathVariable String id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> atualizar(@PathVariable String id, @RequestBody Curso dados) {
        return repository.findById(id).map(existente -> {
            existente.setDescricao(dados.getDescricao());
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
