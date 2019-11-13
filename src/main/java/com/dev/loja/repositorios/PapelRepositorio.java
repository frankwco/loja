package com.dev.loja.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.modelos.Papel;

public interface PapelRepositorio extends JpaRepository<Papel, Long> {

}
