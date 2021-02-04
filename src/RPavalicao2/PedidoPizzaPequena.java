package RPavalicao2;

import java.util.Objects;

public class PedidoPizzaPequena extends PedidoPizza {

	private Sabor sabor;
	
	public PedidoPizzaPequena(String nome, int telefone, int quantidade, FormaEntrega formaEntrega, Sabor sabor) {
		super(nome, telefone, quantidade, formaEntrega);
		this.sabor = sabor;
	}
	
	public Sabor getSabor() {
		return sabor;
	}
	
	public double getPreco() {
		return super.getQuantidade() * 30;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sabor);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof PedidoPizzaPequena))
			return false;
		PedidoPizzaPequena other = (PedidoPizzaPequena) obj;
		return sabor == other.sabor;
	}
	
	

}
