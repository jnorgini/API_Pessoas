package com.juliananorgini.API_Pessoas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.juliananorgini.API_Pessoas.entities.Pessoa;
import com.juliananorgini.API_Pessoas.repositories.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa(null, "Maria Brown", "14/04/1994");
		Pessoa p2 = new Pessoa(null, "Alex Green", "18/08/1998");
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
		
	}

}
