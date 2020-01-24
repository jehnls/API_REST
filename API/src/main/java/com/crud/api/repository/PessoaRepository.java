package com.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.entidade.pessoa.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
