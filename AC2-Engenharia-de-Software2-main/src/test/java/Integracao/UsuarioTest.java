package Integracao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UsuarioTest {
	@Test
	public void TesteUsuario() {
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setNome("Guilherme");
		usuario.setEmail("gui_kovaleski@hotmail.com");
		usuario.setMoedas (1);
		assertEquals(true, usuario.equals(usuario));
		
	}
}