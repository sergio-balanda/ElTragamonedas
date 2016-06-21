package ar.edu.unlam.basica2.tp4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {

	@Test
	public void testTragamonedas() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		Integer posicionTamborUno = miTragamonedas.tamborUno.getPosicion();
		Integer posicionTamborDos = miTragamonedas.tamborDos.getPosicion();
		Integer posicionTamborTres = miTragamonedas.tamborTres.getPosicion();
		assertTrue( 
				(posicionTamborUno >= 1 && posicionTamborUno <= 10) &&
				(posicionTamborDos >= 1 && posicionTamborDos <= 10) &&
				(posicionTamborTres >= 1 && posicionTamborTres <= 10)
				);
	}
	
	@Test
	public void comprobarQueLosTamboresEstenEnUnoAntesDeActivar(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		Integer valorEsperado = 1;
		assertEquals(valorEsperado, miTragamonedas.tamborUno.getPosicion());
		assertEquals(valorEsperado, miTragamonedas.tamborDos.getPosicion());
		assertEquals(valorEsperado, miTragamonedas.tamborTres.getPosicion());
	}
	
	@Test
	public void testPremio(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		while(miTragamonedas.entregaPremio() == false){
			assertFalse(miTragamonedas.entregaPremio());
			miTragamonedas.activar();
		}
		if(miTragamonedas.entregaPremio() == true){
			assertTrue(miTragamonedas.entregaPremio());
		}
	}
	@Test
	public void seCreeUnNumeroAleatorioEntreUnoYDiez() {
		RandoNumberGenerator newGenerator = new RandoNumberGenerator();
		Integer numeroAleatorio = newGenerator.generate();
		assertTrue(numeroAleatorio >=1 && numeroAleatorio <= 10);
	}

}