package AulaClassesObjetos;

public class Vendas {
	
	private String nome;
	private double SalarioFixo;
	private double comissao;
	private double vendaFeita;
	private double totalVendas;
	private double totalComissao;
	private double salarioTotal;
	
	public Vendas(String nome, double SalarioFixo, double comissao) {
		this.nome = nome;
		this.SalarioFixo = SalarioFixo;
		this.comissao = comissao;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public double getSalarioFixo() {
		return SalarioFixo;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public double totalVendas() {
		return vendaFeita; 
	}
	
	public void vendaFeita(double valor) {
		if(valor > 0.0) {
			vendaFeita += valor;
		}
	}
	
	public double totaComissao() {
		totalComissao = vendaFeita * comissao;
		return totalComissao;
	}
	
	public double salarioTotal() {
		salarioTotal = SalarioFixo + totalComissao;
		return salarioTotal;
	}

}
