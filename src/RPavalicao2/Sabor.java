package RPavalicao2;

public enum Sabor {
	
	PORTUGUESA("PORTUGUESA"),
	CALABRESA("CALABRESA"),
	NAPOLITANA("NAPOLITANA"),
	BACON("BACON");

	private String sabor;
	
	Sabor(String sabor) {
		this.sabor = sabor;
	}
	
	@Override
	public String toString() {
		return sabor;
	}

}
