package com.api.loja_produtos.controllers;

import com.api.loja_produtos.models.ProdutoModel;
import com.api.loja_produtos.repositories.ProdutoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos") // Define que todas as rotas começam com /produtos
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository; // Injeção de dependência automática

    // 1. CREATE (POST)
    @PostMapping
    public ResponseEntity<ProdutoModel> salvarProduto(@RequestBody ProdutoModel produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
    }

    // 2. READ ALL (GET)
    @GetMapping
    public ResponseEntity<List<ProdutoModel>> listarProdutos() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    // 3. READ ONE (GET por ID)
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarUmProduto(@PathVariable(value = "id") UUID id) {
        Optional<ProdutoModel> produto = repository.findById(id);
        if(produto.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(produto.get());
    }

    // 4. UPDATE (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarProduto(@PathVariable(value = "id") UUID id, @RequestBody ProdutoModel dadosNovos) {
        Optional<ProdutoModel> produtoO = repository.findById(id);
        if(produtoO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
        ProdutoModel produtoBanco = produtoO.get();
        BeanUtils.copyProperties(dadosNovos, produtoBanco, "id"); // Copia os novos dados mantendo o ID original
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(produtoBanco));
    }

    // 5. DELETE (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarProduto(@PathVariable(value = "id") UUID id) {
        Optional<ProdutoModel> produtoO = repository.findById(id);
        if(produtoO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado.");
        }
        repository.delete(produtoO.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado com sucesso.");
    }
}
