package com.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Livro;

public interface LivroInterface extends JpaRepository<Livro, Long> {

}
