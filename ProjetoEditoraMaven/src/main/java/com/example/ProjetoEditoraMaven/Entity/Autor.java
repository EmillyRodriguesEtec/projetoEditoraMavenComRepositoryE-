package com.example.ProjetoEditoraMaven.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "autor")
public class Autor {

	@Column(name = "nome_autor")
	private String nomeAutor;
	
	@Column(name = "cntt_autor")
	@Type(type = "char")
	private String cnttAutor;
	
	@Id
	@Type(type = "char")
	@Column(name = "cpf_autor")
	private String cpfAutor;
	
	public void escreveLivro() {
		
	}

}
