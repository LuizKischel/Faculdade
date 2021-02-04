package Poliformismo2;

public class Fatura implements Tributavel, Pagavel {

	private String codigo;
	private int quantidade;
	private double valor;
	
	public Fatura(String codigo, int quantidade, double valor) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	@Override
	public double getValorDevido() {
		return getINSS() + (getValorDevido() * 0.4);
	}

	@Override
	public double getImpostoDevido() {
		return getValorDevido() * 0.11;
	}

	@Override
	public double getINSS() {
		return 0;
	}

}
