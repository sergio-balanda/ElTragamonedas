package ar.edu.unlam.basica2.tp4;

public class Tragamonedas {
	
	public Tambor tamborUno;
	public Tambor tamborDos;
	public Tambor tamborTres;
	FixNumberGenerator generator = new FixNumberGenerator(1);
	
	public Tragamonedas() {
		this.tamborUno=new Tambor(generator);
		this.tamborDos=new Tambor(generator);
		this.tamborTres=new Tambor(generator);
	}
	
	
	public void activar() {
		this.tamborUno.girar();
		this.tamborDos.girar();
		this.tamborTres.girar();
	}
	
	public Boolean entregaPremio() {
		return (this.tamborUno.getPosicion() == this.tamborDos.getPosicion()) &&
				this.tamborUno.getPosicion() == (this.tamborTres.getPosicion());
	}
}
