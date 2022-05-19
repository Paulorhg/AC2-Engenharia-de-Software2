package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Desafio;
import com.projects.praticandoAPI.modelo.Topico;
import com.projects.praticandoAPI.repository.DesafioRepository;
import com.projects.praticandoAPI.repository.UsuarioRepository;

public class DesafioForm {
	
	private String nome;
	private Topico topico;
	private Integer pontuacao;
	
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
	
	public Desafio converter(DesafioRepository desafioRepository) {
		
		return new Desafio(nome, topico, pontuacao);
	}
}
