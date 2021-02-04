package aula15102020;

import java.util.Objects;

public class ContaTelefone extends Conta {
	
	private int minutosLocais;
	private int minutosLongaDistancia;
	
	public ContaTelefone (Consumidor consumidor, double valorDevido, int minutosLocais, int minutosLongaDistancia) {
		super(consumidor, valorDevido);
		this.minutosLocais = minutosLocais;
		this.minutosLongaDistancia = minutosLongaDistancia;		
	}
	
	public void imprimir () {
		System.out.println("Consumidor: " + this.getConsumidor().getNome());
		System.out.println("Minutos em ligações locais: " + this.minutosLocais);
		System.out.println("Minutos em ligações de longa distância: " + this.minutosLongaDistancia);
		System.out.println("Valor a pagar: R$" + this.getValor());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getConsumidor(), getValor(), minutosLocais, minutosLongaDistancia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaTelefone other = (ContaTelefone) obj;
		if (minutosLocais != other.minutosLocais)
			return false;
		if (minutosLongaDistancia != other.minutosLongaDistancia)
			return false;
		return true;
	}
	
	

}
