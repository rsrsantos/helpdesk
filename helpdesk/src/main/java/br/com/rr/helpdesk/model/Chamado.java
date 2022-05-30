package br.com.rr.helpdesk.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the chamado database table.
 * 
 */
@Entity
@Table(name = "chamado", schema = "helpdesk")
@XmlRootElement
@Getter
@Setter
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Chamado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String assunto;
	
	@Column(name="equipamento_servico_descricao")
	private String tombamento;

	@ManyToOne
	@JoinColumn(name = "equipamento_servico")
	private ChamadoEquipamentoServico equipamento;

	@Column(name = "mesmo_solicitante")
	private Boolean mesmoSolicitante;

	@Column(name = "problema_relatado")
	private String problemaRelatado;

	@ManyToOne
	@JoinColumn(name = "setor")
	private Setor setor;

	// bi-directional many-to-one association to UsuarioAtendente
	@ManyToOne
	@JoinColumn(name = "atendente")
	private Usuario atendente;

	// bi-directional many-to-one association to UsuarioRequerente
	@ManyToOne
	@JoinColumn(name = "requerente")
	private Usuario requerente;

	@ManyToOne
	@JoinColumn(name = "solicitante")
	private Usuario solicitante;
	
	@Column(name="data_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataRegistro;


	public Chamado() {
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assunto == null) ? 0 : assunto.hashCode());
		result = prime * result + ((atendente == null) ? 0 : atendente.hashCode());
		result = prime * result + ((dataRegistro == null) ? 0 : dataRegistro.hashCode());
		result = prime * result + ((equipamento == null) ? 0 : equipamento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mesmoSolicitante == null) ? 0 : mesmoSolicitante.hashCode());
		result = prime * result + ((problemaRelatado == null) ? 0 : problemaRelatado.hashCode());
		result = prime * result + ((requerente == null) ? 0 : requerente.hashCode());
		result = prime * result + ((setor == null) ? 0 : setor.hashCode());
		result = prime * result + ((solicitante == null) ? 0 : solicitante.hashCode());
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
		Chamado other = (Chamado) obj;
		if (assunto == null) {
			if (other.assunto != null)
				return false;
		} else if (!assunto.equals(other.assunto))
			return false;
		if (atendente == null) {
			if (other.atendente != null)
				return false;
		} else if (!atendente.equals(other.atendente))
			return false;
		if (dataRegistro == null) {
			if (other.dataRegistro != null)
				return false;
		} else if (!dataRegistro.equals(other.dataRegistro))
			return false;
		if (equipamento == null) {
			if (other.equipamento != null)
				return false;
		} else if (!equipamento.equals(other.equipamento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mesmoSolicitante == null) {
			if (other.mesmoSolicitante != null)
				return false;
		} else if (!mesmoSolicitante.equals(other.mesmoSolicitante))
			return false;
		if (problemaRelatado == null) {
			if (other.problemaRelatado != null)
				return false;
		} else if (!problemaRelatado.equals(other.problemaRelatado))
			return false;
		if (requerente == null) {
			if (other.requerente != null)
				return false;
		} else if (!requerente.equals(other.requerente))
			return false;
		if (setor == null) {
			if (other.setor != null)
				return false;
		} else if (!setor.equals(other.setor))
			return false;
		if (solicitante == null) {
			if (other.solicitante != null)
				return false;
		} else if (!solicitante.equals(other.solicitante))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chamado [id=" + id + ", assunto=" + assunto + ", equipamento=" + equipamento + ", mesmoSolicitante=" + mesmoSolicitante + ", problemaRelatado=" + problemaRelatado
				+ ", setor=" + setor + ", atendente=" + atendente + ", requerente=" + requerente + ", solicitante=" + solicitante + ", dataRegistro=" + dataRegistro + "]";
	}

	public String getTombamento() {
		return tombamento;
	}

	public void setTombamento(String tombamento) {
		this.tombamento = tombamento;
	}

}