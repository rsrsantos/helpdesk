package br.com.rr.helpdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rr.helpdesk.repository.ChamadoRepository;

@Service
public class ChamadoService {
	
	@Autowired
	ChamadoRepository chamadoRepository;

}
