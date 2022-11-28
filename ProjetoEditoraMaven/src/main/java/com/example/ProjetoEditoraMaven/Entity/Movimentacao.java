package com.example.ProjetoEditoraMaven.Entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.example.ProjetoEditoraMaven.Enums.FormaPagamentoEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movimentacao")
public class Movimentacao {

	@Id
	@GeneratedValue
	@Column(name = "nmr_mov")
	private int nmrMov;
	
	@Column(name = "data_mov")
	private LocalDate dataMov;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "forma_pag")
	private FormaPagamentoEnum formaPagamento;
	
	@JoinColumn(name = "cnpj_edit")
	@ManyToOne
	@Type(type = "char")
	private Editora cnpjEditora;
	
	@JoinColumn(name = "cod_nf")
	@OneToOne
	private NotaFiscal codNF;
	
	public void gerarNotaFiscal() {
		
	}
		
}
