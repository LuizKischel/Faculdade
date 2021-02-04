package aula15102020;

import java.util.Objects;

public class ContaAgua extends Conta {
	
	private double metrosCubicos;
	
	public ContaAgua (Consumidor consumidor, double valorDevido, double metrosCubicos) {
		super(consumidor, valorDevido);
		this.metrosCubicos = metrosCubicos;
	}
	
	public void imprimir () {
		System.out.println("Conta de Água");
		System.out.println("Consumidor: " + this.getConsumidor().getNome());
		System.out.println("Consumo: " + this.metrosCubicos + " metros cúbicos");
		System.out.println("Valor a pagar: R$" + this.getValor());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getConsumidor(), getValor(), metrosCubicos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaAgua other = (ContaAgua) obj;
		return this.metrosCubicos == other.metrosCubicos && //
				this.getValor() == other.getValor() && //
				Objects.equals(getConsumidor(), other.getConsumidor());
	}	
}
