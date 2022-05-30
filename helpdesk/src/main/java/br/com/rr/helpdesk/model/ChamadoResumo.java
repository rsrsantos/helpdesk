package br.com.rr.helpdesk.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vw_chamado_resumo", schema = "helpdesk")
@Getter
@Setter
@EqualsAndHashCode
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ChamadoResumo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer chamado;

	private String assunto;

	private String equipamento;

	@Column(name = "problema_relatado")
	private String problemaRelatado;

	private String setor;

	private String situacao;

	@Column(name = "atendente")
	private String usuarioAtendente;

	@Column(name = "solicitante")
	private String usuarioSolicitante;

	@Column(name = "requerente")
	private String usuarioRequerente;

	@Column(name = "profissional")
	private String usuarioProfissional;

	private String inicio;

	private String fim;

	private String diagnostico;
	
	@Column(name="requerente_id")
	private Integer requerenteId;
	
	@Column(name="situacao_id")
	private Integer situacaoId;
	
	@Column(name="os_nro")
	private String osNro;
	
	@Column(name="atendente_id")
	private Integer atendenteId;

	public ChamadoResumo() {
	}

}