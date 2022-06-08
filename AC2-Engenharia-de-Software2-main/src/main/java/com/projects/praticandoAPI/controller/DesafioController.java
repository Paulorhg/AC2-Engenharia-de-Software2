package com.projects.praticandoAPI.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projects.praticandoAPI.controller.dto.DesafioDto;
import com.projects.praticandoAPI.controller.form.DesafioForm;
import com.projects.praticandoAPI.modelo.Desafio;
import com.projects.praticandoAPI.repository.DesafioRepository;

@RestController
@CrossOrigin
@RequestMapping("/desafios")
public class DesafioController {
	
	@Autowired
	private DesafioRepository desafioRepository;
	
	@GetMapping
	public List<DesafioDto> lista() {
		List<Desafio> desafios = desafioRepository.findAll();
		return DesafioDto.converter(desafios);
	}
	
	@PostMapping
	public ResponseEntity<DesafioDto> cadastrar(@RequestBody DesafioForm form, UriComponentsBuilder uriBuilder) {
		Desafio desafio = form.converter(desafioRepository);
		desafioRepository.save(desafio);
		
		URI uri = uriBuilder.path("/desafios/{id}").buildAndExpand(desafio.getId()).toUri();
		return ResponseEntity.created(uri).body(new DesafioDto(desafio));
	}
}
