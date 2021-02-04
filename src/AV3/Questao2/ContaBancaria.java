package AV3.Questao2;

public class ContaBancaria implements Imprimivel {

	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String formatoImpressao() {
		String form = "Nome: " + titular + ". Saldo: R$" + saldo;
		return form;
	}
}
