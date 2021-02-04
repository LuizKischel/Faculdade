package Poliformismo2;

public abstract class Empregado implements Tributavel, Pagavel {
	
	private final String nome;

	public Empregado(String nome) {
		this.nome = nome;
	}
	
	public final String getNome() {
		return nome;
	}
	
	public final double getSalarioLiquido() {
		return this.getSalarioBruto() - this.getImpostoDevido() - this.getINSS();
	}
	
	@Override
	public final double getImpostoDevido() {
		return this.getSalarioBruto() * 0.2;
	}
	
	@Override
	public final double getINSS() {
		return this.getSalarioBruto() * 0.085;
	}
	
	public abstract double getSalarioBruto();	

	@Override
	public double getValorDevido() {
		return getSalarioLiquido();
	}
}
