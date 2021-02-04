package aula15102020;

import java.util.Objects;

public class Conta {
	
	private Consumidor consumidor;
	private double valorDevido;
	
	public Conta (Consumidor consumidor, double valorDevido) {
		this.consumidor = Objects.requireNonNull(consumidor);
		this.valorDevido = valorDevido;
	}
	
	public double getValor () {
		return this.valorDevido;
	}
	
	public void imprimir () {
		System.out.println("");
	}
	
	public Consumidor getConsumidor () {
		return consumidor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consumidor == null) ? 0 : consumidor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorDevido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Conta other = (Conta) obj;
		if (consumidor == null) {
			if (other.consumidor != null) {
				return false;
			}
		} else if (!consumidor.equals(other.consumidor)) {
			return false;
		}
		if (Double.doubleToLongBits(valorDevido) != Double.doubleToLongBits(other.valorDevido)) {
			return false;
		}
		return true;
	}
	
	
	
}
