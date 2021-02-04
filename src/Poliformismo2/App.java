package Poliformismo2;

public class App {

	public static void main(String[] args) {
		
		Mensalista mens = new Mensalista("Luiz", 1400);
		System.out.println(mens.getNome());
		System.out.println(mens.getSalarioBruto());
		
		Comissionado c = new Comissionado("João", 500.0, 10.0);
		System.out.println(c.getSalarioBruto());
		
		BaseMaisComissao base = new BaseMaisComissao("Pedro", 5000.0, 50.0, 1500.0);
		System.out.println(base.getNome());
		

	}

}
