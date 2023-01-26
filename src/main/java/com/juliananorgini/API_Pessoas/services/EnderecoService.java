package com.juliananorgini.API_Pessoas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliananorgini.API_Pessoas.entities.Endereco;
import com.juliananorgini.API_Pessoas.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repository;
	
	public List<Endereco> findAll() {
		return repository.findAll();
	}
	
	public Endereco findById(Long id) {
		Optional<Endereco> obj = repository.findById(id);
		return obj.get();
	}
	
	public Endereco insert(Endereco obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
