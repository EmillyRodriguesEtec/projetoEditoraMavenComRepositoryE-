package com.example.ProjetoEditoraMaven.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "revisor")
public class Revisor {

	@Column(name = "nome_revisor")
	private String nomeRevisor;
	
	@Column(name = "cntt_revisor")
	@Type(type = "char")
	private String cnttRevisor;
	
	@Id
	@Column(name = "cpf_revisor")
	@Type(type = "char")
	private String cpfRevisor;
	
	public void revisarLivro() {
		
	}

}
