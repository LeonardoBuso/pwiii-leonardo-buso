# 🚀 Guia Prático: Criando sua Aplicação com Spring Initializr

O [Spring Initializr](https://spring.io) é a ferramenta oficial recomendada para estruturar e iniciar novos projetos Spring Boot de forma rápida e intuitiva.

## 📌 Guia de Configuração Inicial

1. Navegue até o site **start.spring.io**
2. Escolha o gerenciador de build no campo **Project** (*Maven*, *Gradle - Kotlin* ou *Gradle - Groovy*)
3. Defina a **Language** do desenvolvimento (*Java*, *Kotlin* ou *Groovy*)
4. Selecione a versão desejada do **Spring Boot**
5. Preencha os campos em **Project Metadata** (*Group*, *Artifact*, *Package name*, *Packaging* e versão do *Java*)
6. Escolha o formato de **Configuration** (*Properties* ou *YAML*)
7. Clique no botão **ADD DEPENDENCIES** e inclua os módulos necessários
8. Finalize clicando em **GENERATE** para realizar o download do zip contendo a estrutura base

---

## 🛠️ Especificações Adotadas Neste Projeto

Para a construção desta aplicação, foram selecionadas as seguintes diretrizes:

* **Gerenciador de Build:** Maven
* **Linguagem Principal:** Java
* **Versão do Spring Boot:** 4.1.0
* **Formato de Saída (Packaging):** Jar
* **Arquivo de Configuração:** Properties (`application.properties`)
* **Versão do JDK:** Java 21
* **Módulos & Bibliotecas:** Spring Web, Lombok e Spring Boot DevTools

Após baixar e extrair o arquivo gerado, abra a pasta na sua IDE de preferência e inicie o desenvolvimento!

---

## 📚 Módulos & Bibliotecas Utilizadas

### 🌐 Spring Web
Módulo essencial para a criação de serviços web e APIs RESTful utilizando a arquitetura Spring MVC. Inclui o **Apache Tomcat** como servidor de aplicação embutido, dispensando configurações externas.

### ⚡ Lombok
Ferramenta voltada para aumentar a produtividade e eliminar código boilerplate. Através de anotações como `@Getter`, `@Setter`, `@Data` e `@Builder`, gera automaticamente os métodos repetitivos durante a compilação.

### 🛠️ Spring Boot DevTools
Módulo de suporte ao desenvolvedor que proporciona reinicialização automática da aplicação a cada alteração salva no código, além de suporte ao recurso de **LiveReload**.

### 🗄️ Spring Data JPA & PostgreSQL Driver
* **O que é o JPA?** É a especificação padrão do Java para ORM (Object-Relational Mapping). Ele faz a ponte de comunicação entre o código orientado a objetos (Java) e o banco de dados relacional (SQL).
* **Para que serve?** Ele elimina a necessidade de escrever consultas SQL manuais (`INSERT`, `SELECT`, `UPDATE`) para operações básicas. O JPA transforma suas classes Java em tabelas e gerencia os dados mapeados automaticamente. O driver do PostgreSQL fornece a comunicação de rede específica com este banco.

---

## 🏗️ Gerenciadores de Build

### Maven
Ferramenta clássica de automação de build e gerenciamento de dependências baseada em arquivos XML (`pom.xml`). Trata-se da opção mais consolidada no mercado Java.

### Gradle
Alternativa moderna e altamente performática ao Maven, que utiliza scripts em Groovy ou Kotlin (`build.gradle`). Oferece compilação incremental mais veloz.

---

## 💻 Linguagens Suportadas

### Java
A linguagem nativa, tradicional e mais amplamente utilizada para construir aplicações no ecossistema Spring.

### Kotlin
Linguagem moderna voltada para a JVM que se destaca pela concisão e prevenção nativa de erros de ponteiro nulo (*null-safety*).

### Groovy
Linguagem dinâmica que roda sobre a JVM, conhecida por sua sintaxe enxuta e expressiva.

---

## 🏷️ Entendendo a Versão do Framework (Releases vs Snapshots)

- **Versões Estáveis** (ex: `4.1.0`): Lançamentos oficiais prontos para ambiente de produção, testados e consolidados.
- **Versões SNAPSHOT** (ex: `4.1.1-SNAPSHOT`): Versões de compilação contínua e em teste. Contêm novidades em desenvolvimento, mas não possuem garantia de estabilidade e devem ser evitadas em produção.

---

## 📝 Detalhando o Project Metadata

### Group
Corresponde ao identificador único da sua organização ou empresa (ex: `com.empresa`, `br.com.meudominio`). Serve como o pacote principal do projeto.

### Artifact
Nome que identifica especificamente o projeto ou microserviço (ex: `catalogo-produtos`). Define o nome da pasta e do arquivo executável final.

### Package Name
A junção do *Group* com o *Artifact* (ex: `com.empresa.catalogoprodutos`), representando o caminho raiz de todos os arquivos de código-fonte.

### Packaging
Determina como a aplicação será distribuída após o build:
- **Jar:** Gera um arquivo executável contendo o servidor web embutido. É o formato padrão e recomendado para aplicações modernas.
- **War:** Formato projetado para ser publicado dentro de servidores de aplicação tradicionais já instalados na infraestrutura.

### Configuration
Formato preferido para gerenciar as propriedades e variáveis de ambiente da aplicação:
- **Properties:** Formato tradicional `chave=valor` através do arquivo `application.properties`.
- **YAML:** Estrutura baseada em indentação através de arquivos `.yml` ou `.yaml`, ideal para configurações hierárquicas.

---

## 🫘 O que é um Spring Bean?

Um **Bean** é qualquer objeto que tem sua criação, configuração e ciclo de vida **totalmente gerenciados pelo Spring**, ao invés de ser instanciado manualmente pelo desenvolvedor com a instrução `new`.

Todos os Beans ativos ficam armazenados dentro do **Spring Container** (ApplicationContext).

Formas comuns de registrar um Bean:
1. Adicionando anotações de componente como `@Component`, `@Service` ou `@RestController` diretamente sobre a classe.
2. Declarando um método com a anotação `@Bean` dentro de uma classe anotada com `@Configuration`.

Esse mecanismo é a base da **Injeção de Dependência**: os componentes apenas declaram do que precisam, e o Spring injeta a instância correta automaticamente.

---

## 📂 Estrutura de Pastas e Arquitetura Restful

Diferente do ecossistema Node/Express que usa rotas flexíveis, o Spring Boot adota um padrão rígido de camadas baseado em responsabilidades estruturadas dentro do caminho principal (`src/main/java/com/api/loja_produtos/`):

```text
com.api.loja_produtos/
│
├── controllers/    # Camada de Entrada: Define os Endpoints HTTP da API (Equivale às Routes do Express).
├── models/         # Camada de Domínio: Contém as Entidades que representam as Tabelas SQL no Banco.
├── repositories/   # Camada de Acesso a Dados: Interfaces responsáveis pelas Queries SQL automáticas.
└── LojaProdutosApplication.java  # Classe Principal: Ponto de partida que inicializa o servidor.
```

---

## 🔧 Configurando o Arquivo de Propriedades (Banco de Dados)

O desenvolvedor pode optar por usar o formato tradicional ou o hierárquico. Ambos devem ficar salvos dentro do diretório `src/main/resources/`.

### Opção A: Utilizando o `application.properties`
Utiliza o formato linear padrão de `chave=valor`:

```properties
spring.application.name=loja-produtos

# Configuração da URL de Conexão com o PostgreSQL e Nome do Banco (ProdutosJava)
spring.datasource.url=jdbc:postgresql://localhost:5432/ProdutosJava

# Credenciais de Acesso Seguras usando Variáveis de Ambiente
spring.datasource.username=${DB_USERNAME:postgres}
spring.datasource.password=${DB_PASSWORD:postgres}

# Estratégia de Atualização Automática das Tabelas do Banco (update)
spring.jpa.hibernate.ddl-auto=update

# Exibição e Formatação das Queries SQL geradas no Terminal
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Opção B: Utilizando o `application.yml`
Entrega o mesmo resultado, porém estruturado por recuos por tabulação (espaçamentos):

```yaml
spring:
  application:
    name: loja-produtos
  datasource:
    url: jdbc:postgresql://localhost:5432/ProdutosJava
    username: ${DB_USERNAME:postgres}
    password: ${DB_PASSWORD:postgres}
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
```

> **🛡️ Segurança de Credenciais:** A sintaxe `${DB_PASSWORD:postgres}` significa que o Spring tentará ler uma variável de ambiente chamada `DB_PASSWORD` do sistema operacional. Caso ela não exista, ele utilizará a senha padrão após os dois pontos (`postgres`). Isso permite que você envie o código para o GitHub sem expor suas senhas reais.

---

## 💻 Construindo a API REST Completa

### 1. Como adicionar a dependência do JPA e PostgreSQL
Caso seu projeto não possua o Spring Data JPA configurado, abra o arquivo `pom.xml` na raiz do projeto e adicione os seguintes blocos dentro da tag `<dependencies>`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

### 2. Criando o Modelo (`models/ProdutoModel.java`)
Representa a tabela do banco de dados. Cada propriedade da classe será mapeada como uma coluna da tabela.

```java
package com.api.loja_produtos.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUTOS")
public class ProdutoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; // Gera um identificador UUID automático
    
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer quantidade;

--- PARA QUE SERVEM OS GETTERS E SETTERS? ---
Como os atributos são privados (private), nenhuma classe externa consegue acessá-los diretamente.
Os GETTERS servem para "pegar" ou ler o valor do atributo (ex: retornar o preço).

Os SETTERS servem para "definir" ou alterar o valor do atributo (ex: modificar a quantidade).
Eles garantem o princípio de encapsulamento da Programação Orientada a Objetos.

public UUID getId() { return id; }
public void setId(UUID id) { this.id = id; }

public String getNome() { return nome; }
public void setNome(String nome) { this.nome = nome; }

public String getDescricao() { return descricao; }
public void setDescricao(String descricao) { this.descricao = descricao; }

public BigDecimal getPreco() { return preco; }
public void setPreco(BigDecimal preco) { this.preco = preco; }

public Integer getQuantidade() { return quantidade; }
public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }}
```
### 3. Criando o Repositório (`repositories/ProdutoRepository.java`)
Camada responsável por herdar todos os métodos básicos de CRUD (salvar, buscar, atualizar e deletar) sem que você precise escrever nenhuma linha de código.

```java
package com.api.loja_produtos.repositories;

import com.api.loja_produtos.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, UUID> { 
    // Ao estender JpaRepository, o Spring registra automaticamente este componente como um Bean e fornece os métodos prontos: save(), findAll(), findById() e delete().
}
```

### 4. Criando as Rotas da API (`controllers/ProdutoController.java`)

Mapeia os verbos HTTP correspondentes seguindo as boas práticas da arquitetura RESTful.

```java
package com.api.loja_produtos.controllers;

import com.api.loja_produtos.models.ProdutoModel;
import com.api.loja_produtos.repositories.ProdutoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos") // Define o caminho raiz da rota como '/produtos'public class ProdutoController {

@Autowiredprivate ProdutoRepository repository; // Injeta o Bean do repositório automaticamente

// 📥 CADASTRO (POST) - Mapeado para HTTP POST /produtos
    @PostMappingpublic ResponseEntity salvarProduto(@RequestBody ProdutoModel produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
}

// 📋 LISTAR TODOS (GET) - Mapeado para HTTP GET /produtos
    @GetMappingpublic ResponseEntity<List> listarProdutos() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
}

// 🔍 BUSCAR UM POR ID (GET) - Mapeado para HTTP GET /produtos/{id}
    @GetMapping("/{id}")
    public ResponseEntity buscarUmProduto(@PathVariable(value = "id") UUID id) {
        Optional produto = repository.findById(id);
        if(produto.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
            return ResponseEntity.status(HttpStatus.OK).body(produto.get());
}

// 🔄 ATUALIZAR (PUT) - Mapeado para HTTP PUT /produtos/{id}
@PutMapping("/{id}")
public ResponseEntity atualizarProduto(@PathVariable(value = "id") UUID id, 
@RequestBody ProdutoModel dadosNovos) {
    Optional produtoO = repository.findById(id);
    if(produtoO.isEmpty()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
    }

    ProdutoModel produtoBanco = produtoO.get(); // Mescla os dados novos com os dados existentes mantendo o mesmo ID
        BeanUtils.copyProperties(dadosNovos, produtoBanco, "id");
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(produtoBanco));
}

// ❌ DELETAR (DELETE) - Mapeado para HTTP DELETE /produtos/{id}
@DeleteMapping("/{id}")
public ResponseEntity deletarProduto(@PathVariable(value = "id") UUID id) {
    Optional produtoO = repository.findById(id);
    if(produtoO.isEmpty()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
    }
        repository.delete(produtoO.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso.");
}
```

## 🏃 Como Rodar a Aplicação Pelo Terminal
Para garantir o funcionamento completo do ecossistema sem conflitos de extensões de IDEs, execute o projeto diretamente do terminal da máquina.

1. Abra o terminal integrado e certifique-se de estar exclusivamente na pasta raiz do projeto (onde o arquivo `pom.xml` está visível).

2. Execute o comando oficial do empacotador do Maven: <br>
`bash ./mvnw spring-boot:run`  

3. Aguarde o terminal concluir a leitura e apresentar a linha de sucesso contendo: <br>
`Tomcat started on port 8080 (http) with context path '/'`

## 🌐 Acessando no Localhost

Com a aplicação ativa, abra o seu navegador de internet ou utilitário de requisições de API (Insomnia / Postman):
* Para testar a raiz e verificar o funcionamento global: http://localhost:8080/
* Para enviar requisições de CRUD para a sua API de produtos: http://localhost:8080/produtos