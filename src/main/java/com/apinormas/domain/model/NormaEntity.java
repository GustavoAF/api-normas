package com.apinormas.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="norma", schema="bdnorma")
@Entity
public class NormaEntity {
	
	@Id
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="data_public")
	private OffsetDateTime data_public;
	
	@Column(name="status")
	private String status;
	
	
	
	

}
