package Avaliacao2;

public class AppMain {

	public static void main(String[] args) {
		
		Importado im = new Importado(01, "cafe", 20, 50);
		im.getPrecoMinimo();
		Nacional na = new Nacional(02, "Batata", 50, Categoria.ARTESANAL);
		Nacional ne = new Nacional(02, "Batata", 25, Categoria.INDUSTRIALIZADO);
		Nacional ni = new Nacional(02, "Batata", 10, Categoria.ARTESANAL);
		Nacional no = new Nacional(02, "Batata", 0, Categoria.ARTESANAL);
		na.getPrecoFinal();
		Loja loja = new Loja("DIDIO");
		loja.novoProduto(na);
		loja.novoProduto(ne);
		loja.novoProduto(ni);
		loja.novoProduto(no);
		System.out.println(no);
		System.out.println(loja);
	}

}
