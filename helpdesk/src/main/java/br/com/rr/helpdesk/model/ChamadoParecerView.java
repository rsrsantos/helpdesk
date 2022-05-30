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
@Table(name = "vw_parecer_por_chamado", schema = "helpdesk")
@XmlRootElement
@Getter
@Setter
@EqualsAndHashCode
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ChamadoParecerView implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column
	private Integer chamado;

	@Column
	private String parecer;

}
