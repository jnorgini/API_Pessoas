package com.juliananorgini.API_Pessoas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.juliananorgini.API_Pessoas.entities.Pessoa;
import com.juliananorgini.API_Pessoas.repositories.PessoaRepository;
import com.juliananorgini.API_Pessoas.services.exceptions.DatabaseException;
import com.juliananorgini.API_Pessoas.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll() {
		return repository.findAll();
	}
	
	public Pessoa findById(Long id) {
		Optional<Pessoa> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Pessoa insert(Pessoa obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Pessoa update(Long id, Pessoa obj) {
		try {
			Pessoa entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	public void updateData(Pessoa entity, Pessoa obj) {
		entity.setNome(obj.getNome());
		entity.setDataDeNascimento(obj.getDataDeNascimento());
	}	
}
