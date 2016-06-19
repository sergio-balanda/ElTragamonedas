package ar.edu.unlam.basica2.tp4;

public class FixNumberGenerator implements NumberGenerator{
	
	private Integer number;
	
	public FixNumberGenerator (Integer number) {
		this.number=number;
	}
	
	@Override
	public Integer generate() {
		
		return this.number;
	}

}
