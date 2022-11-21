package com.example.ProjetoEditoraMaven.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "nota_fiscal")
public class NotaFiscal {

	@Id
	@GeneratedValue
	@Column(name = "cod_nf")
	private int codNF;
	
	@Column(name = "valor_unit_nf")
	private Long valorUnitNF;
	
	@Column(name = "valor_total_nf")
	private Long valorTotalNF;
	
	@Column(name = "dt_emissao")
	private LocalDate dataEmissao;
	
	public int emitirNotaFiscal() {
		return codNF;
	}

}
