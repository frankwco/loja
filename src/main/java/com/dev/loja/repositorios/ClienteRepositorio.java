package com.dev.loja.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.modelos.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
