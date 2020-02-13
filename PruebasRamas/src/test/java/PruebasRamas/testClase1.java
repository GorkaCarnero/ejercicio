package PruebasRamas;

import static org.junit.Assert.*;

import org.junit.Test;

public class testClase1 {
	private Clase1 clase1 = new Clase1();
	
	@Test
	public void testCuadrado() {
		int resultado = clase1.cuadrado(2);
		int resultadoEsperado = 4;
		assertEquals(resultado,resultadoEsperado);
	}

}
