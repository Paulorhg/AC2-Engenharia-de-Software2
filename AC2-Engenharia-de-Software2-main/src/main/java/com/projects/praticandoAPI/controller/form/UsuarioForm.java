package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.PlanoUsuario;
import com.projects.praticandoAPI.modelo.Usuario;
import com.projects.praticandoAPI.repository.UsuarioRepository;

public class UsuarioForm {
	
	private String nome;
	private String email;
	private String senha;
	private PlanoUsuario plano;
	private Integer moedas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setPlano(PlanoUsuario plano) {
		this.plano = plano;
	}

	public PlanoUsuario getPlano() {
		return plano;
	}

	public void setMoedas(Integer moedas) {
		this.moedas = moedas;
	}

	public Integer getMoedas() {
		return moedas;
	}
	
	public Usuario converter(UsuarioRepository usuarioRepository) {
		
		return new Usuario(nome, email, senha, plano, moedas);
	}
}
