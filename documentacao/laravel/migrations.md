# ⚛️ Usando Migrations no Laravel

As **Migrations** no Laravel funcionam como um sistema de versionamento do banco de dados 📦
Elas permitem criar, alterar e organizar tabelas de forma prática e segura.

---

# 🏗️ 1. Criando uma Migration

Use o comando abaixo para criar uma nova migration:

```bash id="m5j0nk"
php artisan make:migration create_nome_da_tabela_table
```

📌 Exemplo:

```bash id="1xzc3p"
php artisan make:migration create_users_table
```

---

# ✏️ 2. Editando os Campos da Tabela

Após criar a migration, o Laravel gerará um arquivo dentro da pasta:

```id="0d1j1r"
database/migrations
```

Dentro desse arquivo, altere os campos da tabela no método `up()`:

```php id="ln3w1n"
public function up(): void
{
    Schema::create('users', function (Blueprint $table) {
        $table->id();
        $table->string('name');
        $table->string('email')->unique();
        $table->timestamps();
    });
}
```

---

# ▶️ 3. Executando as Migrations

Depois de configurar os campos, execute:

```bash id="fhz0jd"
php artisan migrate
```

📌 Esse comando cria as tabelas no banco de dados automaticamente.

---

# ✅ 4. Verificando o Status

Para conferir se as migrations foram executadas corretamente:

```bash id="7a9p4m"
php artisan migrate:status
```

📌 O Laravel mostrará:

* ✔️ Migrations executadas
* ❌ Migrations pendentes

---

# 💡 Comandos Úteis

### ⏪ Desfazer última migration

```bash id="g2nm6v"
php artisan migrate:rollback
```

---

### 🔄 Resetar todas as migrations

```bash id="j2r9wq"
php artisan migrate:reset
```

---

### 🧹 Recriar tudo do zero

```bash id="lq3d9x"
php artisan migrate:fresh
```

⚠️ Apaga todas as tabelas do banco.

---

# 🎯 Resumo

✔️ Criar migration
✔️ Definir campos da tabela
✔️ Executar no banco
✔️ Verificar status

---

🚀 As migrations facilitam muito o desenvolvimento e organização do banco de dados no Laravel!

✔️ Use o comando: php artisan make:migration create_<nome_da_tabela>_table

✔️ Altere os campos dentro do arquivo criado em database/migrations

✔️ Execute a migration com: php artisan migrate

✔️ Confira se deu tudo certo com: php artisan migrate:status