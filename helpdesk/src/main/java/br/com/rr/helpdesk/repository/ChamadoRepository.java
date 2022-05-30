package br.com.rr.helpdesk.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rr.helpdesk.model.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado,UUID> {

	
}
