package com.dev.loja.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.modelos.EntradaProduto;

public interface EntradaProdutoRepositorio extends JpaRepository<EntradaProduto, Long> {

}
