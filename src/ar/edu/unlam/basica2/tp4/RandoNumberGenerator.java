package ar.edu.unlam.basica2.tp4;

public class RandoNumberGenerator implements NumberGenerator {

	@Override
	public Integer generate() {
		
		return (int)(Math.random()*10+1);
	}

}
