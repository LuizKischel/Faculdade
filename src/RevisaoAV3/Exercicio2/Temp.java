package RevisaoAV3.Exercicio2;

public enum Temp {
	
	BAIXO("BAIXO"),
	MEDIO("MEDIO"),
	ALTO("ALTO");
	
	private String temperatura;
	
	private Temp (String temperatura) {
		this.temperatura = temperatura;
	}
	
	@Override
	public String toString() {
		return temperatura;
	}

}
