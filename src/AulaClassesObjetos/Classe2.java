package AulaClassesObjetos;

public class Classe2 {
	
	// Atributos ou propriedades ou campos ou variáveis de instância
	private String titular;
	private double saldo = 0.0;
		
	// Construtor
	
	public Classe2(String titular, double saldo) {
		this.titular = titular; 
		if (saldo > 0.0) {
			this.saldo = saldo;
		}
	}
	
	// Métodos
	
	public void setTitular(String titular) {
		if(titular != null && !titular.isEmpty()) {
			this.titular = titular;
		}
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void depositar(double valor) {
		if(valor > 0.0) {
			this.saldo += valor;
		}
	}
	
	public void sacar(double valor) {
		if(valor > 0.0 && valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
