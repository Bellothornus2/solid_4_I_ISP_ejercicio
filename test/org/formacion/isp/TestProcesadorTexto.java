package org.formacion.isp;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestProcesadorTexto {

	@Test
	public void test_simple() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.Nueva("No");
		procesador.Nueva("himporta");
		procesador.Nueva("la");
		procesador.Nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.Texto());
	}
	
	@Test
	public void test_con_idioma() {
		
		ProcesadorTextoIdioma procesador = new ProcesadorTextoIdioma();
		
		procesador.Nueva("Tengo");
		procesador.Nueva("hambre");
		
		assertEquals("Tengo hambre", procesador.Texto());
		
		assertTrue(procesador.Correcto(Idioma.ES));
	}
}
