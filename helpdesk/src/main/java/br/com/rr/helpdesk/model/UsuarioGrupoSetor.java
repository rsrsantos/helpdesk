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

@Entity
@lombok.Getter
@lombok.Setter
@lombok.EqualsAndHashCode
@lombok.ToString
@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@Table(name="usr_usuario_grupo_setor", schema="public")
public class UsuarioGrupoSetor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="setor")
	private Setor setor;

	@Column(name="autorizacao_automatica")
	private Boolean autorizacaoAutomatica;

	@Column(name="notificacoes_email")
	private Boolean notificacoesEmail;

	@Column(name="notificacoes_sistema")
	private Boolean notificacoesSistema;

	public UsuarioGrupoSetor() {
	}
	
}