package Poliformismo2;

public class Comissionado extends Empregado {
	
	private double vendasBrutas;
	private double percentualComissao;

	public Comissionado(String nome, double vendasBrutas, double percentualComissao) {
		super(nome);
		this.vendasBrutas = vendasBrutas;
		this.percentualComissao = percentualComissao;
	}

	@Override
	public double getSalarioBruto() {
		return vendasBrutas * (percentualComissao / 100);
	}

}
