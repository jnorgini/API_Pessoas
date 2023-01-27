package com.juliananorgini.API_Pessoas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.juliananorgini.API_Pessoas.entities.Endereco;
import com.juliananorgini.API_Pessoas.repositories.EnderecoRepository;
import com.juliananorgini.API_Pessoas.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repository;
	
	public List<Endereco> findAll() {
		return repository.findAll();
	}
	
	public Endereco findById(Long id) {
		Optional<Endereco> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Endereco insert(Endereco obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	public Endereco update(Long id, Endereco obj) {
		try {
			Endereco entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	public void updateData(Endereco entity, Endereco obj) {
		entity.setLogradouro(obj.getLogradouro());
		entity.setBairro(obj.getBairro());
		entity.setCep(obj.getCep());
		entity.setNumero(obj.getNumero());
		entity.setCidade(obj.getCidade());
		entity.setPessoa(obj.getPessoa());
	}	
}
