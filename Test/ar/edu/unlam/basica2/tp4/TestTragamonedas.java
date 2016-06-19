package ar.edu.unlam.basica2.tp4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {

	@Test
	public void testTragamonedas() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		System.out.println("Posiciones");
		System.out.println("Posicion tambor uno: "+miTragamonedas.tamborUno.getPosicion());
		System.out.println("Posicion tambor uno: "+miTragamonedas.tamborDos.getPosicion());
		System.out.println("Posicion tambor uno: "+miTragamonedas.tamborTres.getPosicion());
	}
	@Test
	public void testPremio(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		while(miTragamonedas.entregaPremio() == false){
			miTragamonedas.activar();
		}
		if(miTragamonedas.entregaPremio() == true){
			System.out.println("Posicion ganar");
			System.out.println("posicion tambor uno "+miTragamonedas.tamborUno.getPosicion());
			System.out.println("posicion tambor dos "+miTragamonedas.tamborDos.getPosicion());
			System.out.println("posicion tambor dos "+miTragamonedas.tamborTres.getPosicion());
		}
	}
}
