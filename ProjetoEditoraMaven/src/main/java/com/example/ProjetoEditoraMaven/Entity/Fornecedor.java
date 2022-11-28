package com.example.ProjetoEditoraMaven.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fornecedor")
public class Fornecedor {

	@Id
	@Column(name = "cnpj_forn")
	@Type(type = "char")
	private String cnpjFornecedor;
	
	@Column(name= "local_forn")
	private String localFornecedor;
	
	@Column(name = "rz_social_forn")
	private String rzSocialFornecedor;
	
	@JoinColumn(name = "cnpj_edit")
	@ManyToOne
	@Type(type = "char")
	private Editora cnpjEditora;
	
	public void fornecerMateriais() {
		
	}
	
}
