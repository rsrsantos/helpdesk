package br.com.rr.helpdesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.rr.helpdesk.repository.ChamadoRepository;
import br.com.rr.helpdesk.service.ChamadoService;

@Controller
public class ChamadoControle {
	
	@Autowired
	ChamadoService chamadoService;

}
