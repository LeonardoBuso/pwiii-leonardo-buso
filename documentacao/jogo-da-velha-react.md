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