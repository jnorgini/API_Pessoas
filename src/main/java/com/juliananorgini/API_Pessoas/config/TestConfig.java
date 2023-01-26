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
		Pessoa p3 = new Pessoa(null, "Bob Grey", TipoPessoa.FISICA, LocalDate.of(1990, Month.SEPTEMBER, 26));
		Pessoa p4 = new Pessoa(null, "Robert Blue", TipoPessoa.JURIDICA, LocalDate.of(1986, Month.DECEMBER, 29));
		Pessoa p5 = new Pessoa(null, "Lucas Yellow", TipoPessoa.FISICA, LocalDate.of(1992, Month.JUNE, 20));
		
		Endereco e1 = new Endereco(null, "Rua dos Lirios", "Pio XII", "36305-284", 110, "São João Del Rei. Minas Gerais - MG", p1);
		Endereco e2 = new Endereco(null, "Rua Rio Grande do Sul, 125", "Jardim dos Camargos", "06411-900", 38, "Barueri. São Paulo - SP", p2);
		Endereco e3 = new Endereco(null, "Alameda Laranjeiras", "Pinheirinho", "85603-815", 212, "Francisco Beltrão. Paraná - PR", p3);
		Endereco e4 = new Endereco(null, "Avenida Santa Isabel", "Vila Santa Cecília", "09380-045", 937, "Mauá. São Paulo - SP", p4);
		Endereco e5 = new Endereco(null, "Rua Jerônimo Monteiro", "Parque Rizzo", "06702-607", 323, "Cotia - São Paulo - SP", p5);
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3, e4, e5));
		
		
	}

}
