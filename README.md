# Sistema de Gestão - Banco de Dados

Este projeto é um sistema completo de gestão empresarial para a empresa, desenvolvido com **Spring Boot** e banco de dados **PostgreSQL**. Ele inclui funcionalidades de cadastro e gerenciamento de:

- Clientes
- Fornecedores
- Funcionários
- Materiais e Estoque
- Movimentações de Estoque
- Pedidos de Compra
- Serviços e Execuções
- Contratos

## 🛠️ Tecnologias utilizadas

- Java 18
- Spring Boot 3.4.4
- Spring Data JPA
- PostgreSQL
- HTML/CSS/JavaScript (com AJAX)
- Maven
- Docker (opcional)

## 📂 Estrutura do Projeto

```
empresa-crud/
├── src/
│   ├── main/
│   │   ├── java/com/mateus/empresa_crud/          # Código-fonte Java
│   │   ├── resources/
│   │   │   ├── static/                            # Páginas HTML
│   │   │   └── application.properties             # Configurações Spring
│   └── test/                                      # Testes (JUnit)
├── pom.xml                                         # Gerenciamento de dependências Maven
├── compose.yaml                                    # Configuração Docker (opcional)
```

## 🧪 Como rodar o projeto

### Pré-requisitos

- Java 17+ (projeto usa Java 18)
- PostgreSQL (pode usar Docker)
- Maven

### 1. Clonar o repositório

```bash
git clone https://github.com/mateuscardososs/Sistema-Gestao-BancoDados.git
cd Sistema-Gestao-BancoDados/empresa-crud
```

### 2. Criar o banco de dados

Você pode usar o seguinte script SQL no PostgreSQL:

> 📁 Arquivo sugerido: `banco/script_estrutura.sql`

```sql
-- Script simplificado do banco de dados
```

> Obs: O banco deve ser criado com o mesmo nome, usuário e senha configurados em `application.properties`.

### 3. Configurar o `application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 4. Rodar o projeto

```bash
./mvnw spring-boot:run
```

Ou, se estiver usando uma IDE como Eclipse ou IntelliJ, basta rodar a classe `EmpresaCrudApplication.java`.

## 🚀 Funcionalidades principais

- CRUD completo de todas as entidades
- Relacionamentos com chaves estrangeiras e tabelas intermediárias
- Interface web simples (HTML + JS + Bootstrap)
- Integração com banco de dados via Spring Data JPA
- Cadastro de movimentações de estoque com vínculo a materiais
- Execução e controle de serviços

## ✅ Status

✔️ Projeto funcional  
⚠️ Melhorias visuais e testes unitários podem ser adicionados  

## 🧠 Autor

**Mateus Cardoso**  
Desenvolvido para estudos e prática de sistemas corporativos com banco de dados relacional.
