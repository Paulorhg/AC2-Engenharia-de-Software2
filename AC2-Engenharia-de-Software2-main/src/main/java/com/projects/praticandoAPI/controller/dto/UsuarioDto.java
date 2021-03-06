package com.projects.praticandoAPI.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.PlanoUsuario;
import com.projects.praticandoAPI.modelo.Usuario;

public class UsuarioDto {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private PlanoUsuario plano;
	private Integer moedas;
	
	
	public UsuarioDto(Usuario usuario) {
		super();
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		this.plano = usuario.getPlano();
		this.moedas = usuario.getMoedas();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public PlanoUsuario getPlano() {
		return plano;
	}

	public Integer getMoedas() {
		return moedas;
	}
	
	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
	
}
