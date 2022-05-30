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
@Table(name = "vw_qtde_chamados", schema = "helpdesk")
@Getter
@Setter
@EqualsAndHashCode
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class QtdeChamados implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	private Integer requerente;

	@Column(name="chamados_novos")
	private Integer chamadosNovos;
	
	@Column(name="chamados_andamento")
	private Integer chamadosAndamento;
	
	@Column(name="chamados_encaminhado")
	private Integer chamadosEncaminhado;

	@Column(name="chamados_concluidos")
	private Integer chamadosConcluidos;

	@Column(name = "chamados_pendentes")
	private Integer chamadosPendentes;
	
	@Column(name = "chamados_impedintes")
	private Integer chamadosImpedintes;
	
	@Column(name = "chamados_abertos")
	private Integer chamadosAbertos;
	
	@Column(name = "meus_chamados")
	private Integer meusChamados;
	
	@Column(name = "chamados_andamento_todos")
	private Integer chamadosAndamentoTodos;
	
	@Column(name = "chamados_concluidos_todos")
	private Integer chamadosConcluidosTodos;
	
	public QtdeChamados() {
	}

}