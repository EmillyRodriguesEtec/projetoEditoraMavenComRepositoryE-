package com.example.ProjetoEditoraMaven.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name = "livro")
public class Livro {

	@Column(name = "nome_livro")
	private String nomeLivro;
	
	@Column(name = "genero_livro")
	private String generoLivro;
	
	@Column(name = "desc_livro")
	private String descricaoLivro;
	
	@Column(name = "qntdd_livro")
	private String qntddLivro;
	
	@Column(name = "idioma_livro")
	private String idiomaLivro;
	
	@Id
	@GeneratedValue
	@Column(name = "cod_livro")
	private int codLivro;
	
	@JoinColumn(name = "cpf_revisor")
	@ManyToOne
	@Type(type = "char")
	private Revisor cpfRevisor;
	
	@JoinColumn(name = "cnpj_edit")
	@ManyToOne
	@Type(type = "char")
	private Editora cnpjEditora;
	
	@JoinColumn(name = "cpf_autor")
	@ManyToOne
	@Type(type = "char")
	private Autor cpfAutor;
	
	@JoinColumn(name = "nmr_tlivro")
	@ManyToOne
	private TipoLivro nmrTipoLivro;
	
}
