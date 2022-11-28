package com.example.ProjetoEditoraMaven.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@Table(name = "editora")
public class Editora {

	@Column(name = "nome_edit")
	private String nomeEditora;
	
	@Column(name = "local_edit")
	private String localEditora;
	
	@Column(name = "ie_edit")
	@Type(type = "char")
	private String ieEditora;
	
	@Id
	@Type(type = "char")
	@Column(name = "cnpj_edit")
	private String cnpjEditora;
	
	@JoinColumn(name = "cnpj_forn")
	@Type(type = "char")
	@ManyToOne
	private Fornecedor cnpjFornecedor;
	 
	public void editarLivro()
	{
		
	}
	public void receberLivro() {
		
	}
	
	public void solicitarMovimentacao() {
		
	}
	
}
