package aula15102020;

import java.util.Objects;

public class ContaEletricidade extends Conta {
	
	private double kilowatts;
	
	public ContaEletricidade (Consumidor consumidor, double valorDevido, double kilowatts) {
		super(consumidor, valorDevido);
		this.kilowatts = kilowatts;
	}
	
	public void imprimir () {
		System.out.println("Consumidor: " + this.getConsumidor().getNome());
		System.out.println("Consumo: " + kilowatts + " Kw");
		System.out.println("Valor a pagar: " + this.getValor());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getConsumidor(), getValor(), kilowatts);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaEletricidade other = (ContaEletricidade) obj;
		if (Double.doubleToLongBits(kilowatts) != Double.doubleToLongBits(other.kilowatts))
			return false;
		return true;
	}
	
	

}
