package com.juliananorgini.API_Pessoas.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juliananorgini.API_Pessoas.entities.Pessoa;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@GetMapping
	public ResponseEntity<Pessoa> findAll() {
		Pessoa p = new Pessoa(1L, "maria", "18/04/1990");
		return ResponseEntity.ok().body(p);
	}

}
