package com.example.demo_gravacao_mongodb.repository;

import com.example.demo_gravacao_mongodb.model.Estudante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EstudanteRepository extends MongoRepository<Estudante, String> {
}
