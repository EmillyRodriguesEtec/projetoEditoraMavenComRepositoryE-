package com.example.ProjetoEditoraMaven.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.ProjetoEditoraMaven.Enums.TipoLivroEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipo_livro")
public class TipoLivro {

	@Column(name = "preco_unit_tlivro")
	private Long precoUnitTipoLivro;
	
	@Id
	@GeneratedValue
	@Column(name = "nmr_tlivro")
	private int nmrTipoLivro;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "livro_impresso")
	private TipoLivroEnum tipoLivro;
	
}
