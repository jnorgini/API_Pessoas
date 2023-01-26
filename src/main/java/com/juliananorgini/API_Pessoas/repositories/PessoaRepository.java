package com.juliananorgini.API_Pessoas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliananorgini.API_Pessoas.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
