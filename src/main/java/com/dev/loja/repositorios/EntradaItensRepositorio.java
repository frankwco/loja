package com.dev.loja.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.modelos.EntradaItens;

public interface EntradaItensRepositorio extends JpaRepository<EntradaItens, Long> {

}
