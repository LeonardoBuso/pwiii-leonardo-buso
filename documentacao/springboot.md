# 🚀 Guia de Inicialização de Projeto Spring Boot

Este documento apresenta o passo a passo detalhado para configurar e inicializar uma nova aplicação Java utilizando o **Spring Initializr**, a ferramenta oficial de bootstrap do ecossistema Spring.

---

## 📌 Passo a Passo de Configuração

Para iniciar, ace   sse a ferramenta oficial no seu navegador:
👉 **[Spring Initializr (start.spring.io)](https://start.spring.io/)**

Configure as opções na interface gráfica de acordo com os requisitos e especificações da sua arquitetura:

1. **Project (Gerenciador de Dependências):** Escolha entre *Maven*, *Gradle - Groovy* ou *Gradle - Kotlin*.
2. **Language (Linguagem):** Selecione a linguagem principal do seu ecossistema (*Java*, *Kotlin* ou *Groovy*).
3. **Spring Boot (Versão do Framework):** Selecione uma versão estável (evite versões com sufixos `SNAPSHOT` ou `M` para produção).
4. **Project Metadata (Metadados do Projeto):**
   - **Group:** O identificador da sua organização/domínio no formato reverso (ex: `com.empresa`).
   - **Artifact:** O nome do pacote/projeto (ex: `meu-projeto`).
   - **Name:** Nome de exibição da aplicação.
   - **Description:** Breve descrição do propósito do projeto.
   - **Package Name:** Nome do pacote raiz gerado automaticamente a partir do Group + Artifact.
5. **Packaging (Empacotamento):** Escolha o formato final de distribuição (`Jar` para aplicações autônomas ou `War` para servidores externos).
6. **Java (Versão do JDK):** Escolha a versão do Java instalada no seu ambiente de desenvolvimento/servidor.
7. **Dependencies (Dependências):** Adicione as bibliotecas e módulos necessários para o funcionamento da aplicação.

---

## 🛠️ Especificações Técnicas do Projeto

Abaixo estão os parâmetros exatos selecionados para a criação deste projeto específico:

| Parâmetro | Opção Selecionada | Descrição / Propósito |
| :--- | :--- | :--- |
| **Project** | `Maven` | Gerenciamento de dependências e build com `pom.xml`. |
| **Language** | `Java` | Linguagem de programação principal. |
| **Spring Boot Version** | `3.4.1` *(ou versão estável mais recente)* | Framework base para desenvolvimento da aplicação. |
| **Packaging** | `Jar` | Empacotamento executável com servidor embutido (Tomcat). |
| **Java Version** | `21` | Versão LTS (Long-Term Support) com as últimas inovações do Java. |
| **Configuration Format** | `application.properties` | Arquivo de configurações padrão em formato chave=valor. |

---

## 📦 Dependências Adicionadas

Para fornecer os recursos básicos de API REST, produtividade e desenvolvimento ágil, incluímos as seguintes dependências:

* **🌐 Spring Web**:
  - *Descrição:* Constrói aplicações web, incluindo RESTful APIs, utilizando o Spring MVC. Utiliza o Apache Tomcat como servidor web embutido padrão.
* **⚡ Lombok**:
  - *Descrição:* Biblioteca de automação de código Java que reduz a verborragia gerando automaticamente getters, setters, construtores, equals, hashCode e builders via anotações.
* **🛠️ Spring Boot DevTools**:
  - *Descrição:* Ferramentas de suporte ao desenvolvedor que oferecem inicialização rápida de aplicação, LiveReload e reinicializações automáticas a cada alteração no código fonte.

---

## 🎯 Gerando e Executando o Projeto

1. Após configurar todos os campos acima no site, clique no botão **GENERATE** (ou pressione `CTRL + ENTER`).
2. O download de um arquivo `.zip` contendo toda a estrutura inicial do projeto será iniciado.
3. Extraia o arquivo `.zip` no seu diretório de trabalho desejado.
4. Abra a pasta do projeto em sua IDE preferida (*IntelliJ IDEA*, *VS Code*, *Eclipse*, etc.).
5. Aguarde o download das dependências pelo Maven e **seja feliz desenvolvendo sua aplicação!** 🎉