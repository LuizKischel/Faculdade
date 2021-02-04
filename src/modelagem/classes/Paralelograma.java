package modelagem.classes;

public abstract class Paralelograma extends Figura2d {

	private double base;
	private double altura;

	public Paralelograma(String nome, double base, double altura) {
		super(nome);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public final double getArea() {
		return base*altura;
	}

	@Override
	public final double getPerimetro() {
		return (base*2)+(altura*2);
	}

	final double getBase() {
		return base;
	}

	final double getAltura() {
		return altura;
	}

}
