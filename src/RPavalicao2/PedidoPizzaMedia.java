package RPavalicao2;

public class PedidoPizzaMedia extends PedidoPizza {

	private Sabor sabor1;
	private Sabor sabor2;
	
	public PedidoPizzaMedia(String nome, int telefone, int quantidade, FormaEntrega formaEntrega, Sabor sabor1, Sabor sabor2) {
		super(nome, telefone, quantidade, formaEntrega);
		this.sabor1 = sabor1;
		this.sabor2 = sabor2;
	}
	
	public Sabor getSabor1() {
		return sabor1;
	}
	
	public Sabor getSabor2() {
		return sabor2;
	}
	
	public double getPreco() {
		return super.getQuantidade() * 40;
	}

}
