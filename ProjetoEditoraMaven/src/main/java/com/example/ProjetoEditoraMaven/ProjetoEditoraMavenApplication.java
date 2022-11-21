package com.example.ProjetoEditoraMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ProjetoEditoraMaven.Entity.Editora;
import com.example.ProjetoEditoraMaven.Repository.EditoraRepository;

@SpringBootApplication
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
		}
		

}
