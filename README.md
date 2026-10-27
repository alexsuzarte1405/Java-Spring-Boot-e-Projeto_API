# Atividade individual — CRUD com Spring Boot e MongoDB

Projeto atualizado a partir do arquivo `demo-gravacao-mongodb.zip` enviado na atividade. Foram mantidos o nome, o pacote base `com.example.demo_gravacao_mongodb`, a classe principal e as dependências Maven originais (Spring Boot 4.1.1, Java 25, Spring Web MVC e Spring Data MongoDB).

## Entidades

- **Estudante:** `id`, `nome`, `email`, `idade`.
- **Curso:** `id`, `descricao`.
- **Professor:** `id`, `nome`, `email`, `idade`.

Cada entidade tem Model, Repository que estende `MongoRepository`, e Controller com operações cadastrar, buscarTodos, buscarPorId, atualizar e excluir.

## Endpoints

| Método | Estudante | Curso | Professor |
| --- | --- | --- | --- |
| POST | `/estudantes` | `/cursos` | `/professores` |
| GET todos | `/estudantes` | `/cursos` | `/professores` |
| GET por ID | `/estudantes/{id}` | `/cursos/{id}` | `/professores/{id}` |
| PUT | `/estudantes/{id}` | `/cursos/{id}` | `/professores/{id}` |
| DELETE | `/estudantes/{id}` | `/cursos/{id}` | `/professores/{id}` |

Cadastro retorna 201, consulta e atualização bem-sucedidas retornam 200, exclusão retorna 204 e busca/atualização/exclusão de registros inexistentes retornam 404.

## Como rodar

1. Instale **JDK 25** (como definido pelo `pom.xml` original), Maven ou use o Maven Wrapper, e MongoDB.
2. Inicie o MongoDB local na porta 27017; a aplicação usa o banco `atividade_crud`. Para usar outra conexão, configure a variável de ambiente `MONGODB_URI`.
3. Na pasta raiz do projeto, execute no Windows: `mvnw.cmd spring-boot:run` (ou `mvn spring-boot:run` se possuir Maven). No Linux/macOS: `./mvnw spring-boot:run`.
4. Importe `postman/CRUD-Estudantes-Cursos-Professores.postman_collection.json` no Postman, ajuste `baseUrl` caso necessário e envie as requisições.

## Exemplos de JSON

Estudante:
```json
{"id":"1","nome":"João da Silva","idade":30,"email":"joao.silva@email.com"}
```
Curso:
```json
{"id":"curso1","descricao":"Sistemas de Informação"}
```
Professor:
```json
{"id":"prof1","nome":"Maria Oliveira","idade":42,"email":"maria@email.com"}
```

## Enviar ao GitHub

Na pasta do projeto, em terminal com Git configurado:
```bash
git init
git add .
git commit -m "Implementar CRUD de Estudantes, Cursos e Professores"
git branch -M main
git remote add origin https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
git push -u origin main
```
Crie o repositório no GitHub antes de executar `git push`. Se o projeto já tiver um repositório Git, use o fluxo já configurado sem repetir `git init`/`git remote add`.

## Postman

A coleção contém todas as 15 requisições. Para sincronizá-la à sua conta, entre no Postman e importe o arquivo JSON em um workspace. O arquivo local não cria conta nem publica automaticamente as collections.

**Nota:** o ZIP original não continha Model, Repository ou Controller de Estudante; essas classes foram construídas tomando como referência o padrão de cadastro e as especificações do enunciado. O projeto ainda precisa ser compilado e testado em um ambiente com JDK 25 e MongoDB.
