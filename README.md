# 🚀 pwIII - Leonardo Buso

### 📚 Programação Web III – Prof. João Siles

---

# 👋 Welcome!

Olá! Eu sou **Leonardo Buso de Souza** e neste repositório você vai aprender, de forma **simples e prática**, como:

✅ Criar um projeto com **Laravel**
✅ Configurar ambiente de desenvolvimento
✅ Trabalhar com **React (Jogo da Velha)**
✅ Organizar e versionar projetos com **Git**

---

# 🧰 1. Pré-requisitos

Antes de começar, você precisa ter instalado:

* 🐘 PHP
* 📦 Composer
* ⚡ Laravel Installer
* 🟢 Node.js + NPM
* 🖥️ XAMPP (recomendado)

---

# 💻 2. Configuração com Git Bash

### 📂 Passo a passo:

1. Abra a pasta:

```
xampp → htdocs
```

2. Clique com o botão direito → **Git Bash Here**

---

### 🔐 Configurar Git (primeira vez)

```bash
git config --global user.name "Seu Nome"
git config --global user.email seuemail@email.com
```

---

### 📥 Clonar repositório

```bash
git clone URL_DO_SEU_REPOSITORIO
cd nome-da-pasta
```

---

# ⚙️ 3. Instalação do PHP (Automática)

Abra o **PowerShell como Administrador** e execute:

```powershell
Set-ExecutionPolicy Bypass -Scope Process -Force; `
[System.Net.ServicePointManager]::SecurityProtocol = `
[System.Net.ServicePointManager]::SecurityProtocol -bor 3072; `
iex ((New-Object System.Net.WebClient).DownloadString('https://php.new/install/windows/8.4'))
```

---

# 🔧 4. Instalar Laravel

### ✔️ Opção 1 (Global)

```bash
composer global require laravel/installer
```

### ✔️ Opção 2 (Direto no projeto)

```bash
composer create-project laravel/laravel minha-app
```

---

# 🏗️ 5. Criar Projeto Laravel

Dentro da pasta `htdocs`:

```bash
laravel new exemplo-app
```

---

# 🔄 6. Configuração do Projeto

### 📦 Instalar dependências

```bash
composer install
npm install
npm run build
```

---

### 🔑 Configurar ambiente

1. Copie o arquivo:

```
.env.example → .env
```

2. Gere a chave da aplicação:

```bash
php artisan key:generate
```

---

### 🗄️ Banco de dados

```bash
php artisan migrate
```

Digite `yes` quando solicitado.

---

# ▶️ 7. Rodar o Projeto

```bash
php artisan serve
```

Acesse no navegador:

```
http://localhost:8000
```

---

# 💾 8. Salvar no Git

```bash
git add .
git commit -m "Sua mensagem"
git push
```

---

---

# ⚛️ Documentação – React (Jogo da Velha)

## 🎯 Objetivo

Aprender conceitos fundamentais do React:

* Componentes 🧩
* Estado (state) 🔄
* Props 📦
* Renderização dinâmica ⚡

---

# 🧱 Estrutura do Projeto

```
projeto-react/
├── node_modules/
├── public/
├── src/
├── package.json
```

---

# ▶️ Executar Projeto

```bash
npm install
npm start
```

Abra:

```
http://localhost:3000
```

---

# 🧠 Conceitos Principais

## 🔹 Componente

```javascript
function App() {
  return <h1>Hello React</h1>;
}
```

---

## 🔹 State

```javascript
const [xIsNext, setXIsNext] = useState(true);
```

---

## 🔹 Atualização automática

```javascript
setSquares(novoValor);
```

---

# 🎮 Estrutura do Jogo

### 🟦 Square

* Representa cada botão

### 🧩 Board

* Controla o tabuleiro

### 🎯 Game

* Controla regras e vencedor

---

# 🏆 Verificar vencedor

```javascript
function calculateWinner(squares) {
  const lines = [
    [0,1,2], [3,4,5], [6,7,8],
    [0,3,6], [1,4,7], [2,5,8],
    [0,4,8], [2,4,6]
  ];

  for (let [a,b,c] of lines) {
    if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
      return squares[a];
    }
  }
  return null;
}
```

---

# 📦 Versionamento

### ✅ Enviar:

```
src/
public/
package.json
```

### ❌ NÃO enviar:

```
node_modules/
```

---

---

# 🐘 Documentação – Laravel Herd

## ⬇️ 1. Download

Baixe o **Laravel Herd** na documentação oficial.

---

## ⚙️ 2. Configuração

### 📁 Diretório:

```
%USERPROFILE%\.config\herd
```

---

### ▶️ Inicialização

* Abra o **Herd Dashboard**
* Escolha a versão do PHP
* Inicie os serviços

---

## ⚠️ Observações

* Verifique requisitos do sistema
* Reinicie o Herd em caso de erro

---

# ✅ Finalização

🎉 Pronto! Agora você tem:

✔️ Ambiente Laravel configurado
✔️ Projeto React funcional
✔️ Versionamento com Git organizado

---

# 💡 Dica Final

👉 Pratique criando projetos pequenos (CRUD, API, jogos simples).
👉 Isso acelera MUITO seu aprendizado.

---

🔥 **Bons estudos e bom código!**
