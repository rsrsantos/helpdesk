package br.com.rr.helpdesk.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "tip_acao_motivo", schema = "public")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class TipoAcaoMotivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tip_acao_mot_id")
	private Integer id;
	
	@Column(name = "fk_tipo_acao")
	private Integer tipoAcao;
	
	@Column(name = "tip_acao_mot_descricao")
	private String descricao;

}
