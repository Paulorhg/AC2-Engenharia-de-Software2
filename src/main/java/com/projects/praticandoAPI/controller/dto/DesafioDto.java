package com.projects.praticandoAPI.controller.dto;
import com.projects.praticandoAPI.modelo.Desafio;
import com.projects.praticandoAPI.modelo.Topico;


import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.ManyToOne;



public class DesafioDto {

	private Long id;
	private String nome;
	private Topico topico;
	private Integer pontuacao;
	
	public DesafioDto(Desafio desafio) {
		this.id = desafio.getId();
		this.nome = desafio.getNome();
		this.topico = desafio.getTopico();
		this.pontuacao = desafio.getPontuacao();
	}

	public Long getId() {
		return id;
	}

	public static List<DesafioDto> converter(List<Desafio> desafios) {
		return desafios.stream().map(DesafioDto::new).collect(Collectors.toList());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Topico getTopico() {
		return topico;
	}

	public void setTopico(Topico topico) {
		this.topico = topico;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

}
