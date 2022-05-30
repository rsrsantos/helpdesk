package br.com.rr.helpdesk.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="servico_possiveis_solucoes", schema="helpdesk")
@Getter
@Setter
public class ServicoPossiveisSolucoe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String descricao;

	public ServicoPossiveisSolucoe() {
	}
}