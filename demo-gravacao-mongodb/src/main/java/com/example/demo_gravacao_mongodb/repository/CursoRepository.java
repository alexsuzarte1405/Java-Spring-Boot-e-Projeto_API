package com.example.demo_gravacao_mongodb.repository;

import com.example.demo_gravacao_mongodb.model.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, String> {
}
