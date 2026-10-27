package com.example.demo_gravacao_mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "professores")
public class Professor {
    @Id
    private String id;
    private String nome;
    private String email;
    private Integer idade;

    public Professor() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }
}
