# 🚀 Guia Prático: Criando sua Aplicação com Spring Initializr

O [Spring Initializr](https://start.spring.io) é a ferramenta oficial recomendada para estruturar e iniciar novos projetos Spring Boot de forma rápida e intuitiva.

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