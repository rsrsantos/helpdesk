package br.com.rr.helpdesk.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "chamado_situacao_servico", schema = "helpdesk")
@Getter
@Setter
public class ChamadoSituacaoServico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fim;

	@Temporal(TemporalType.TIMESTAMP)
	private Date inicio;

	// bi-directional many-to-one association to ChamadoProfissional
	@ManyToOne
	@JoinColumn(name = "chamado_profissional")
	private ChamadoProfissional chamadoProfissional;

	// bi-directional many-to-one association to ChamadoSituacao
	@ManyToOne
	@JoinColumn(name = "situacao")
	private ChamadoSituacao situacao;

	// bi-directional many-to-one association to Servico
	@ManyToOne
	@JoinColumn(name = "diagnostico")
	private Servico servico;
	
	@ManyToOne
	@JoinColumn(name = "qualificacao")
	private ChamadoQualificador qualificacao;

	public ChamadoSituacaoServico() {
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chamadoProfissional == null) ? 0 : chamadoProfissional.hashCode());
		result = prime * result + ((fim == null) ? 0 : fim.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result + ((servico == null) ? 0 : servico.hashCode());
		result = prime * result + ((situacao == null) ? 0 : situacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChamadoSituacaoServico other = (ChamadoSituacaoServico) obj;
		if (chamadoProfissional == null) {
			if (other.chamadoProfissional != null)
				return false;
		} else if (!chamadoProfissional.equals(other.chamadoProfissional))
			return false;
		if (fim == null) {
			if (other.fim != null)
				return false;
		} else if (!fim.equals(other.fim))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (servico == null) {
			if (other.servico != null)
				return false;
		} else if (!servico.equals(other.servico))
			return false;
		if (situacao == null) {
			if (other.situacao != null)
				return false;
		} else if (!situacao.equals(other.situacao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChamadoSituacaoServico [id=" + id + ", fim=" + fim + ", inicio=" + inicio + ", chamadoProfissional=" + chamadoProfissional + ", situacao=" + situacao
				+ ", servico=" + servico + "]";
	}

}