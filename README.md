# 🐾 Pet Mania API

## 📌 Sobre o projeto

O **Pet Mania API** é um projeto desenvolvido em Java com Spring Boot, como parte de um desafio de Back-End.

O objetivo do desafio foi corrigir erros existentes no código-fonte, organizar a estrutura da aplicação e implementar uma API REST para realizar operações de cadastro e consulta de pets.

## 🚀 Tecnologias utilizadas

- Java 25
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- MySQL
- Maven
- Postman

## 🛠️ Funcionalidades

- Cadastro de pets.
- Listagem de todos os pets.
- Integração com banco de dados MySQL.
- Mapeamento de entidades com JPA.
- Disponibilização de endpoints HTTP.

## 📂 Estrutura do projeto

O projeto segue uma organização em camadas:

- **Entities:** representação das entidades do banco de dados.
- **Repositories:** comunicação com o banco de dados.
- **Services:** implementação das regras de negócio.
- **Controllers:** disponibilização dos endpoints da API.
- **Enums:** definição de valores preestabelecidos.

## 🔧 Correções e melhorias realizadas

Durante o desafio, foram identificados e corrigidos diversos problemas no projeto original:

### 1. Entity Pet
- Correção de erros de sintaxe.
- Ajustes nos construtores da classe.
- Inclusão do atributo ID.
- Correção dos tipos de dados dos atributos.
- Ajustes nos métodos getters e setters.
- Correção do método `isDisponivel()`.

### 2. Enums
- Correção da nomenclatura dos valores.
- Padronização dos elementos em letras maiúsculas.

### 3. Repository
- Correção da declaração da interface.
- Ajuste da herança com JpaRepository.
- Correção do tipo de dado do identificador para Integer.

### 4. Service
- Criação da camada Service.
- Implementação da anotação `@Service`.
- Integração com PetRepository.
- Implementação dos métodos para listar e cadastrar pets.

### 5. Controller
- Correção das instâncias e injeções de dependência.
- Ajustes nas anotações `@GetMapping` e `@PostMapping`.
- Integração com a camada Service.
- Correção dos métodos responsáveis pelas requisições HTTP.

### 6. Banco de dados
- Configuração do arquivo `application.properties`.
- Integração com o MySQL.
- Criação e configuração do banco de dados.

## ▶️ Como executar o projeto

**1. Clone o repositório**

```bash
git clone https://github.com/nick120q/pet-mania-api-challenge.git
```

**2. Acesse a pasta do projeto**

```bash
cd pet-mania-api-challenge
```

**3. Configure o banco de dados**

No arquivo `application.properties`, configure as informações de conexão com o MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Substitua os valores pelos dados do seu ambiente.

**4. Execute a aplicação**

Pelo terminal, utilizando Maven:

```bash
mvn spring-boot:run
```

Ou execute a classe principal da aplicação pela sua IDE.

## 🧪 Testes

Após iniciar a aplicação, foram realizados testes utilizando o **Postman**, verificando o funcionamento das requisições:

- **POST:** cadastro de novos pets.
- **GET:** listagem dos pets cadastrados.

Os testes permitiram verificar o funcionamento da API e sua comunicação com o banco de dados MySQL.

## 🎯 Objetivo do desafio

O desafio proporcionou a oportunidade de praticar conceitos importantes do desenvolvimento Back-End, como:

- Desenvolvimento de APIs REST.
- Programação orientada a objetos.
- Arquitetura em camadas.
- Integração com banco de dados.
- Utilização do Spring Boot e Spring Data JPA.
- Identificação e correção de erros.
- Testes de requisições HTTP.

## 👨‍💻 Autor

**Nicollas Silva Barbosa**
