package com.projects.praticandoAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.praticandoAPI.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findByNome(String nome);
	
	List<Usuario> findAll();
}
