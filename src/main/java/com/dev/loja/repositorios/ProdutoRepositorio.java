package com.dev.loja.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.modelos.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
