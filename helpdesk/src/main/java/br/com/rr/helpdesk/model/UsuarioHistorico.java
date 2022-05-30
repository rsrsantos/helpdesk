package br.com.rr.helpdesk.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usr_usuario_historico", schema = "public")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UsuarioHistorico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "tipo_acao")
	private TipoAcaoMotivo tipoAcao;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_registro")
	private Date dataRegistro;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name = "usuario")
	private Usuario usuario;

}
