package com.juliananorgini.API_Pessoas.config;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.juliananorgini.API_Pessoas.entities.Endereco;
import com.juliananorgini.API_Pessoas.entities.Pessoa;
import com.juliananorgini.API_Pessoas.entities.enums.TipoPessoa;
import com.juliananorgini.API_Pessoas.repositories.EnderecoRepository;
import com.juliananorgini.API_Pessoas.repositories.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa(null, "Maria Brown", TipoPessoa.JURIDICA, LocalDate.of(1994, Month.APRIL, 14));
		Pessoa p2 = new Pessoa(null, "Alex Green", TipoPessoa.FISICA, LocalDate.of(1998, Month.AUGUST, 18));
		
		Endereco e1 = new Endereco(null, "Rua dos Lirios", "36305-284", 110, "São João Del Rei. Minas Gerais - MG", p1);
		Endereco e2 = new Endereco(null, "Rua Rio Grande do Sul", "06411-900", 125, "Barueri. São Paulo - SP", p2);
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
		
		
	}

}
