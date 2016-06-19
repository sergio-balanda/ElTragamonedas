package ar.edu.unlam.basica2.tp4;



public class Tambor {
	private Integer posicion;
	
	public Tambor(NumberGenerator generator) {
		this.posicion=generator.generate();
	}
	
	public Integer getPosicion() {
		return this.posicion;
	}
	
	public void girar() {
		RandoNumberGenerator aleatorio = new RandoNumberGenerator();
		this.posicion=aleatorio.generate();
	}
}
