package com.api.loja_produtos.repositories;

import com.api.loja_produtos.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, UUID> {
    // Pronto! Aqui já existem os métodos save(), findAll(), findById() e delete().
}
