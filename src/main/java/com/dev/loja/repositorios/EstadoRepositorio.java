package com.dev.loja.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.modelos.Estado;

public interface EstadoRepositorio extends JpaRepository<Estado, Long> {

}
