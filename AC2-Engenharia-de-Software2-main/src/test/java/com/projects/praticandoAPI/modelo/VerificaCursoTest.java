package com.projects.praticandoAPI.modelo;

import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//import com.projects.praticandoAPI.controller.TopicosJPAController;
//import com.projects.praticandoAPI.controller.UsuarioController;
//import com.projects.praticandoAPI.controller.DesafioController;

public class VerificaCursoTest {
	
	@Test
	public void testeVerificaBonificacao() {
		Curso verifica = new Curso();
		Object curso = verifica.setNome("Engenharia de Software");
		System.out.println("O Curso é " + curso.toString());
	}
}

