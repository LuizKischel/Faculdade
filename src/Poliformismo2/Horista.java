package Poliformismo2;

public final class Horista extends Empregado {
	
	private double salarioHora;
	private double horasTrabalhadas;

	public Horista(String nome, double salarioHora, double horasTrabalhadas) {
		super(nome);
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public final double getSalarioBruto() {
		return horasTrabalhadas * salarioHora;
	}

}
