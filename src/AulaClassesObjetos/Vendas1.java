package AulaClassesObjetos;

public class Vendas1 {

	public static void main(String[] args) {
		Vendas bg = new Vendas("Luiz", 1500.0, 0.5);
		
	System.out.println(bg.getNome() + " " + bg.getSalarioFixo() + " " + bg.getComissao());
		bg.vendaFeita(300.0);
		System.out.println(bg.totalVendas());
		System.out.println(bg.totaComissao());
		bg.vendaFeita(300.0);
		System.out.println(bg.totalVendas());
		System.out.println(bg.totaComissao());
		System.out.println("Total do Salário: " + bg.salarioTotal());

	}

}
