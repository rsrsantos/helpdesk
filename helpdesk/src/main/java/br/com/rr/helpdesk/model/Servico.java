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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="servico", schema="helpdesk")
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@Getter
@Setter
public class Servico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String descricao;

	@Column(name="duracao_media")
	private Integer duracaoMedia;

	//bi-directional many-to-one association to ChamadoSituacaoServico
//	@OneToMany(mappedBy="servico")
//	private List<ChamadoSituacaoServico> chamadoSituacaoServicos;

	//bi-directional many-to-one association to ServicoCategoria
	@ManyToOne
	@JoinColumn(name="categoria")
	private ServicoCategoria categoria;

	//bi-directional many-to-one association to ServicoGrupo
	@ManyToOne
	@JoinColumn(name="grupo")
	private ServicoGrupo grupo;

	//bi-directional many-to-one association to ServicoTipo
	@ManyToOne
	@JoinColumn(name="tipo")
	private ServicoTipo tipo;

	public Servico() {
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((duracaoMedia == null) ? 0 : duracaoMedia.hashCode());
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Servico other = (Servico) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (duracaoMedia == null) {
			if (other.duracaoMedia != null)
				return false;
		} else if (!duracaoMedia.equals(other.duracaoMedia))
			return false;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + ", descricao=" + descricao + ", duracaoMedia=" + duracaoMedia + ", categoria=" + categoria + ", grupo=" + grupo + ", tipo=" + tipo + "]";
	}

	

}