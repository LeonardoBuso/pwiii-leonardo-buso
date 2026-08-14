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
