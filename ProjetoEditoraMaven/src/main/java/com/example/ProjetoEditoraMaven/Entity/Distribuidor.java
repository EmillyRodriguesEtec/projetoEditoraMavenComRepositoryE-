package com.example.ProjetoEditoraMaven.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "distribuidor")
public class Distribuidor {

	@Id
	@Type(type = "char")
	@Column(name = "cnpj_dist")
	private String cnpjDistribuidor;
	
	@Column(name = "local_dist")
	private String localDistribuidor;
	
	@Column(name = "nome_dist")
	private String nomeDistribuidor;
	
	@Column(name = "cntt_dist")
	@Type(type = "char")
	private String cnttDistribuidor;
	
	@JoinColumn(name = "cnpj_edit")
	@Type(type = "char")
	@OneToOne
	private Editora cnpjEditora;
	
	public void distribuirLivros() {
		
	}
	
}
