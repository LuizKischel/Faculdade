package Enum;

public enum NumExer {

	CARA("Cara"),
	COROA("Coroa");
	
	private String moeda;
	
	private NumExer (String moeda) {
		this.moeda = moeda;
	}
	
	public String getMoeda () {
		return moeda;
	}
	
	@Override
	public String toString() {
		return moeda;
	}
}
