package aula15102020;

public class Main {

	public static void main(String[] args) {
		
		Consumidor cons = new Consumidor("João");
		
		Conta cont = new Conta(cons, 50);
		
		ContaTelefone ctf = new ContaTelefone(cons, 80, 10, 20);
		ContaAgua contAgua = new ContaAgua(cons, 30, 150);
		contAgua.imprimir();
		System.out.println(cons.novaConta(contAgua));
		
	}

}
