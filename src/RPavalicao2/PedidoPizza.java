package RPavalicao2;

import java.util.Objects;

import Enum.TipoMotor;

public class PedidoPizza extends Cliente {
	
	private int quantidade;
	private FormaEntrega formaEntrega;

	public PedidoPizza(String nome, int telefone, int quantidade, FormaEntrega formaEntrega) {
		super(nome, telefone);
		this.quantidade = quantidade;
		this.formaEntrega = formaEntrega;
	}

	public String getCliente() {
		return super.getNome();
	}
	
	public FormaEntrega getEntrega () {
		return formaEntrega;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(formaEntrega, quantidade);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoPizza other = (PedidoPizza) obj;
		return formaEntrega == other.formaEntrega && quantidade == other.quantidade;
	}
	
	

}
