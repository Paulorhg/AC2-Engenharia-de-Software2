package Integracao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DesafioTest {
	@Test
	public void User() {
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setNome("Guilherme");
		usuario.setEmail("gui_kovaleski@hotmail.com");
		usuario.setMoedas (1);
		assertEquals(true, usuario.equals(usuario));
		
	}
	@Test
	public void Topic() {
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setNome("Guilherme");
		usuario.setEmail("gui_kovaleski@hotmail.com");
		usuario.setMoedas (1);
		assertEquals(true, usuario.equals(usuario));
		
	}
}