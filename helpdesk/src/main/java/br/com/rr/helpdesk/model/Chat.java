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

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode
@Setter
@Getter
@Entity
@Table(name="chat", schema="helpdesk")
public class Chat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String message;
	
	@Column(name="data_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataRegistro;
	
	@ManyToOne
	@JoinColumn(name="para_usuario")
	private Usuario paraUsuario;
	
	@ManyToOne
	@JoinColumn(name="de_usuario")
	private Usuario deUsuario;
	
}