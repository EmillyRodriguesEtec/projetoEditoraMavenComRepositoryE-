package com.example.ProjetoEditoraMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ProjetoEditoraMaven.Entity.Autor;
import com.example.ProjetoEditoraMaven.Entity.Editora;
import com.example.ProjetoEditoraMaven.Entity.NotaFiscal;
import com.example.ProjetoEditoraMaven.Repository.EditoraRepository;

import lombok.Builder;



@SpringBootApplication
@Builder
public class ProjetoEditoraMavenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoEditoraMavenApplication.class, args);
	}
	
		@Autowired
		private EditoraRepository repo;

		@Override
		public void run(String... args) throws Exception {
		Editora editora = Editora.builder().nomeEditora("Álamo")
											.ieEditora("759273957495")
											.cnpjEditora("38943682395648")
											.localEditora("Rua São Bogodá, número 24, Parque Edu Chaves- São Paulo").build();
		repo.save(editora);
		
		Autor autor = Autor.builder().nomeAutor("Josevaldo")
											.cpfAutor("11920875845")
											.cnttAutor("20547549455").build();
		repo.save(autor);
		
		NotaFiscal nf = NotaFiscal.builder().codNF("025874")
											.valorUnitNF(32.00)
											.valorTotalNF(119.90)
											.dataEmissao("2011-nov-26").build();
		repo.save(nf);									

		}
		

}
