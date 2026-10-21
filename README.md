# ☕ Java + Spring Boot | Projeto minha-primeira-api

## 📌 Sobre o projeto

Este projeto faz parte dos estudos sobre **Java e Spring Boot**, com foco na criação de APIs REST e na comunicação entre diferentes sistemas.

### O que é Java?
Java é uma linguagem de programação orientada a objetos, utilizada no desenvolvimento de sistemas, aplicativos e APIs. É conhecida por sua segurança, organização e capacidade de funcionar em diferentes plataformas.

### O que é Spring Boot?
Spring Boot é um framework que facilita o desenvolvimento de aplicações Java, permitindo criar APIs de forma mais rápida e organizada, com configurações simplificadas.

### O que é o projeto minha-primeira-api?
É um projeto de aprendizado que tem como finalidade conhecer a estrutura de uma API REST, entender como as requisições HTTP funcionam e como uma aplicação pode receber, processar e retornar informações.

## 🎯 Objetivo

Compreender os conceitos básicos de Java e Spring Boot, conhecer a estrutura de uma API REST e aprender como os métodos HTTP são utilizados para realizar operações de cadastro, consulta, atualização e exclusão de informações.

## ⚙️ Principais funcionalidades

| Método / Recurso | Funcionalidade |
|---|---|
| GET | Consultar informações |
| POST | Cadastrar novos registros |
| PUT | Atualizar informações |
| DELETE | Excluir registros |
| @RestController | Definir controladores da API |
| @GetMapping | Criar endpoints de consulta |
| @PostMapping | Criar endpoints de cadastro |
| @PutMapping | Criar endpoints de atualização |
| @DeleteMapping | Criar endpoints de exclusão |
| @RequestMapping | Definir caminhos das requisições |

## 🔗 Exemplos de endpoints

Os endpoints representam os endereços utilizados para acessar os recursos de uma API.

Considerando um sistema de cadastro de produtos:

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/produtos` | Listar produtos |
| GET | `/produtos/1` | Consultar produto pelo ID |
| POST | `/produtos` | Cadastrar produto |
| PUT | `/produtos/1` | Atualizar produto |
| DELETE | `/produtos/1` | Excluir produto |

### 💻 Exemplo de requisição

**Método:** GET

**Endereço:** `http://localhost:8080/produtos`

**Exemplo de resposta JSON:**

```json
[
  {
    "id": 1,
    "nome": "Notebook",
    "preco": 3500.00
  },
  {
    "id": 2,
    "nome": "Mouse",
    "preco": 80.00
  }
]
```

Esse exemplo demonstra como uma API pode retornar uma lista de produtos em formato JSON.

> **Observação:** os endpoints e os dados apresentados são exemplos didáticos, não uma confirmação de funcionalidades implementadas no projeto.

## 📚 Conhecimentos adquiridos

### 1. Estrutura do Spring Boot

Importância da organização dos componentes de uma aplicação:

- **Controller:** responsável por receber requisições HTTP.
- **Service:** organiza as regras de negócio.
- **Repository:** realiza operações de acesso aos dados.
- **Model:** representa as informações utilizadas pelo sistema.
- **application.properties:** permite configurar a aplicação.

### 2. Funcionamento de uma API REST

Uma API permite a comunicação entre aplicações por meio de requisições HTTP.

Quando um sistema solicita informações, a API recebe a requisição, realiza o processamento necessário e retorna uma resposta.

### 3. Códigos de resposta HTTP

Alguns códigos utilizados para informar o resultado das requisições:

| Código | Significado |
|---|---|
| 200 | Requisição realizada com sucesso |
| 201 | Recurso criado |
| 400 | Requisição inválida |
| 404 | Recurso não encontrado |
| 500 | Erro interno do servidor |

### 4. Utilização do JSON

JSON é um formato utilizado para organizar e transmitir informações entre aplicações.

Exemplo:

```json
{
  "id": 1,
  "nome": "Notebook",
  "preco": 3500.00,
  "disponivel": true
}
```

### 5. Conceito de CRUD

CRUD representa quatro operações fundamentais utilizadas em sistemas:

- **Create:** criar informações.
- **Read:** consultar registros.
- **Update:** atualizar informações.
- **Delete:** excluir registros.

### 6. Testes de APIs

A importância de executar a aplicação em ambiente local e testar os endpoints para verificar se as requisições estão funcionando corretamente.

A utilidade de ferramentas como o Postman para enviar requisições HTTP e visualizar as respostas.

### 7. Organização e boas práticas

A importância de manter o código organizado, utilizar nomes claros para classes e métodos e separar as responsabilidades de cada componente.

Essas práticas facilitam a manutenção, a identificação de erros e a evolução dos sistemas.

## 🛠️ Tecnologias e ferramentas estudadas

- Java
- Spring Boot
- Spring Initializr
- Maven
- API REST
- HTTP
- JSON
- Postman
- Git e GitHub

