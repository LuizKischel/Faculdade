package modelagem.classes;

public class Quadrado extends Paralelograma {

	public Quadrado(String nome, double lados) {
		super(nome, lados, lados);
	}
	
	public double getLado() {
		return super.getBase();
	}

}
