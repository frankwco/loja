package com.dev.loja.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.modelos.Compra;

public interface CompraRepositorio extends JpaRepository<Compra, Long> {

}
