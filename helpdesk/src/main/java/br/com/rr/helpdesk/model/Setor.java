package br.com.rr.helpdesk.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bas_entidades", schema = "public")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Setor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ent_id")
	private Integer id;
	
	@Column(name = "ent_descricao")
	private String descricao;
	
	@Column(name = "ent_descricao_formatada")
	private String descricaoFormatada;
	
	@Column(name = "ent_sigla")
	private String sigla;
	
	@Column(name = "ent_codigo")
	private String codigo;

	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "id_superior")
	private Setor superior;

	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "ent_hierar_superior")
	private Setor hierarquico;
	
	@Column
	private Boolean inativo;
	
	@Column(name="ent_sup")
	private Boolean entidadeSuperior;
	
	@Column(name="ent_fone_util")
	private Boolean foneUtil;
	
	@Column(name="ent_fone")
	private String fone;
	
	@Column(name="ent_email")
	private String email;
	
	@Column(name="area_gmap")
	private String areaMapa;
	
	@Column(name="horario_funcionamento")
	private String horarioFuncionamento;
	
	private String cnes;

}
