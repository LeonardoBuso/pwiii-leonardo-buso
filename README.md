
# pwIII-leonardo-buso

Programação Web III por Prof João Siles

  

# Creating a Laravel Framework

  

  

Welcome to my Git Hub!👋

  

Hi! I'm Leonardo Buso de Souza and I'm going to teach you how create a Laravel Framework!

  

  

## What you need?

  

  

- PHP

  

- Composer

  

- Laravel installer

  

- Node and NPM

  

- List item

  

  

## Use the Git Bash

  

  

1. Open the xampp folder

  

2. Open the htdocs folder

  

3. Open the Git Bash

  

4. Log in with your name

  

`Enter this code: git config --global user.name "Your-name"`

  

5. Log in with your email

  

`Enter this code: git config --global user.email Your-email`

  

6. Clone your git repository

  

`Enter this code: git clone (Your git url)`

  

7. Open your folder with this code

  

`cd your-folder`

  

## How to install these components

  

  

> Open the Windows PowerShell how administrator

  

  

Enter this code

  

  

Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://php.new/install/windows/8.4'))

  

  

## Laravel Installer

  

  

> Enter this code

  

  

composer global require laravel/installer
or
composer create-project laravel/laravel minha-app

  

  

## Create the App

  

  

1. Close the Windows PowerShell

  

2. Open the terminal in your project

  

> Use these codes

  

> `cd --`

  

> `cd --`

  

> `cd C:`

  

> `cd xampp`

  

> `cd htdocs`

  

> `cd your repository`

  

  

3. Create the project

  

`Enter this code: laravel new example-app`

  

## Configuration

  

1. Close the terminal

2. Open the Windows PowerShell

  

> Enter this code to install al the files by creating the vendor folder

> `composer install`

> Enter this code to generate the files that are dependencies of Js

> `npm install`

> Enter this code to take the files from npm install and generate executables from them

> `npm run build`

  

3. Go to the Visual Studio Code copy and paste the file .env.example

4. Rename the file to .env

5. Go to the Windows PowerShell again

> Enter this code to help execute

> `php artisan`

> Enter this code to create a key

> `php artisan key:generate`

> Entre this code to run all the database files

> `
php artisan migrate`

> Write 'Yes'

## Save the project

 1. Close all
 2. Go to Git Bash

> Enter with these codes
> `cd your-repository`
> `git add .`
> `git commit- m "Your message"`
> `git push`

<br><br>

# Documentação – Tutorial React (Jogo da Velha)

## 1. Introdução

Este documento explica o funcionamento do projeto desenvolvido no tutorial oficial do React: o jogo da velha (Tic‑Tac‑Toe). O objetivo do tutorial é ensinar os principais conceitos do React, como componentes, estado (state), propriedades (props) e atualização dinâmica da interface.

---

# 2. Tecnologias Utilizadas

* **React** – biblioteca JavaScript para criação de interfaces
* **JavaScript (ES6+)**
* **Node.js** – ambiente de execução
* **npm** – gerenciador de pacotes
* **HTML e CSS**

---

# 3. Estrutura do Projeto

Após criar o projeto, a estrutura principal fica semelhante a:

```
projeto-react/
│
├── node_modules/
├── public/
│   └── index.html
│
├── src/
│   ├── App.js
│   ├── index.js
│   ├── App.css
│   └── index.css
│
├── package.json
└── package-lock.json
```

## Descrição das Pastas

### node_modules

Contém todas as bibliotecas instaladas pelo npm. Essa pasta não deve ser enviada para o Git.

### public

Contém arquivos públicos, como o HTML base da aplicação.

### src

Contém o código principal da aplicação React.

---

# 4. Inicialização do Projeto

Para executar o projeto localmente:

### 1. Instalar dependências

```
npm install
```

### 2. Executar o servidor de desenvolvimento

```
npm start
```

Após executar o comando, o navegador abrirá normalmente em:

```
http://localhost:3000
```

Sempre que um arquivo do projeto for salvo, o navegador atualiza automaticamente.

---

# 5. Funcionamento do React

O React funciona baseado em **componentes**.

Componentes são partes reutilizáveis da interface.

Exemplo simples de componente:

```javascript
function App() {
  return (
    <h1>Hello React</h1>
  );
}

export default App;
```

---

# 6. Componentes do Jogo da Velha

O projeto é dividido em três componentes principais.

## Square (Casa do tabuleiro)

Representa cada quadrado do jogo.

Responsável por:

* Mostrar "X" ou "O"
* Detectar cliques

Exemplo simplificado:

```javascript
function Square({ value, onClick }) {
  return (
    <button className="square" onClick={onClick}>
      {value}
    </button>
  );
}
```

---

## Board (Tabuleiro)

Responsável por organizar os quadrados em um grid 3x3.

Ele controla o estado das casas do jogo.

Exemplo de estado do tabuleiro:

```javascript
const [squares, setSquares] = useState(Array(9).fill(null));
```

Isso cria um vetor com 9 posições representando cada casa do jogo.

---

## Game (Jogo)

Controla a lógica geral:

* turno dos jogadores
* histórico de jogadas
* vencedor

---

# 7. Manipulação de Estado

React usa **state** para armazenar dados que mudam.

Exemplo:

```javascript
const [xIsNext, setXIsNext] = useState(true);
```

Isso indica de quem é o próximo turno.

---

# 8. Atualização da Interface

Quando o estado muda, o React atualiza automaticamente a interface.

Exemplo:

```javascript
setSquares(nextSquares);
```

Após executar esse comando, o React renderiza novamente o componente.

---

# 9. Função de Verificação de Vitória

O jogo precisa verificar se algum jogador venceu.

Isso é feito analisando todas as combinações possíveis.

Exemplo:

```javascript
function calculateWinner(squares) {
  const lines = [
    [0,1,2],
    [3,4,5],
    [6,7,8],
    [0,3,6],
    [1,4,7],
    [2,5,8],
    [0,4,8],
    [2,4,6]
  ];

  for (let i = 0; i < lines.length; i++) {
    const [a, b, c] = lines[i];

    if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
      return squares[a];
    }
  }

  return null;
}
```

Essa função retorna o vencedor quando três posições iguais são encontradas.

---

# 10. Atualização Automática (Hot Reload)

Durante o desenvolvimento, qualquer alteração salva nos arquivos atualiza automaticamente o navegador.

Isso acelera muito o processo de desenvolvimento.

---

# 11. Versionamento com Git

Arquivos que devem ser enviados para o repositório:

```
src/
public/
package.json
package-lock.json
.gitignore
```

Arquivos que **não devem ser enviados**:

```
node_modules/
```

---
