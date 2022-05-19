package com.projects.praticandoAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.praticandoAPI.modelo.Desafio;

public interface DesafioRepository extends JpaRepository<Desafio, Long> {

	Desafio findByNome(String nome);
	
	List<Desafio> findAll();

}