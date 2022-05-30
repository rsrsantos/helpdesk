package br.com.rr.helpdesk.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * The persistent class for the chamado_profissional database table.
 * 
 */
@Entity
@Table(name = "chamado_profissional", schema = "helpdesk")
public class ChamadoProfissional implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// bi-directional many-to-one association to Chamado
	@ManyToOne
	@JoinColumn(name = "chamado")
	private Chamado chamado;

	// bi-directional many-to-one association to UsuarioProfissional
	@ManyToOne
	@JoinColumn(name = "profissional")
	private Usuario usuario;

	// bi-directional many-to-one association to ChamadoSituacaoServico
	@OneToMany(mappedBy = "chamadoProfissional")
	private List<ChamadoSituacaoServico> chamadoSituacaoServicos;

	public ChamadoProfissional() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Chamado getChamado() {
		return chamado;
	}

	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chamado == null) ? 0 : chamado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		ChamadoProfissional other = (ChamadoProfissional) obj;
		if (chamado == null) {
			if (other.chamado != null)
				return false;
		} else if (!chamado.equals(other.chamado))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChamadoProfissional [id=" + id + ", chamado=" + chamado + ", usuario=" + usuario + "]";
	}

}