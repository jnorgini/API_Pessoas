package com.juliananorgini.API_Pessoas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliananorgini.API_Pessoas.entities.Pessoa;
import com.juliananorgini.API_Pessoas.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
	
	public Pessoa findById(Long id) {
		Optional<Pessoa> obj = repository.findById(id);
		return obj.get();
	}
}
