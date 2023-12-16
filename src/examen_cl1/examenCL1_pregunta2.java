package examen_cl1;

import static org.junit.Assert.*;

import org.junit.Test;

public class examenCL1_pregunta2 {
                  // realizar los test con las  variables SUR, Nort, Orie, Occi, Palco, Dsct, Impo
	@Test
	public void test() {
		double resultado = Interfacecl1.calcularSUR(5000);
		double esperado = 2400.0;
		assertEquals(resultado, resultado);
	}
	@Test
	public void test2() {
		double resultado = Interfacecl1.calcularSUR(500);
		double esperado = 240.0;
		assertEquals(resultado, resultado);
	}
	@Test
	public void test3() {
		double resultado = Interfacecl1.calcualrDsct(precio, sUR, nort, orie, occi, palco);
		double esperado = 2400.0;
		assertEquals(resultado, resultado);
	}
	@
	public void test4() {
		double resultado = Interfacecl1.calcularOcci(s);
		double esperado = 2400.0;
		assertEquals(resultado, resultado);
	}
	   @Test
	    void testDeterminarObsequio() {
	        assertEquals("No hay obsequio", Interfacecl1.calcularImp(5));
	    }


}
