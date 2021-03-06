package RPavalicao2;

import java.util.Objects;

public class PedidoPizzaGrande extends PedidoPizza {
	
	private Sabor sabor1;
	private Sabor sabor2;
	private Sabor sabor3;

	public PedidoPizzaGrande(String nome, int telefone, int quantidade, FormaEntrega formaEntrega, Sabor sabor1, Sabor sabor2, Sabor sabor3) {
		super(nome, telefone, quantidade, formaEntrega);
		this.sabor1 = sabor1;
		this.sabor2 = sabor2;
		this.sabor3 = sabor3;
	}
	
	public Sabor getSabor1() {
		return sabor1;
	}
	
	public Sabor getSabor2() {
		return sabor2;
	}
	
	public Sabor getSabor3() {
		return sabor3;
	}
	
	public double getPreco() {
		return super.getQuantidade() * 50;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sabor1, sabor2, sabor3);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof PedidoPizzaGrande))
			return false;
		PedidoPizzaGrande other = (PedidoPizzaGrande) obj;
		return sabor1 == other.sabor1 && sabor2 == other.sabor2 && sabor3 == other.sabor3;
	}
	
	
	

}
