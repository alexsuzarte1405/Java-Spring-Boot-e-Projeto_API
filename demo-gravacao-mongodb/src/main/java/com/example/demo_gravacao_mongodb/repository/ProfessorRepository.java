package com.example.demo_gravacao_mongodb.repository;

import com.example.demo_gravacao_mongodb.model.Professor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfessorRepository extends MongoRepository<Professor, String> {
}
