package figuras;

public class Quadrado extends Paralelogramo {

	public Quadrado(String nome, double lado) {
		super(nome, lado, lado);
	}
	
	public double getLado() {
		return super.getLadoA();
	}

	@Override
	public boolean equals(Object outro) {
		if (outro == null) {
			return false;
		}
		if (this == outro) {
			return true;
		}
		if (this.getClass() ==  outro.getClass()) {
			return this.getLado() == ((Quadrado) outro).getLado();
		}
		return false;
	}

}
