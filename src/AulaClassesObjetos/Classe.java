package AulaClassesObjetos;

public class Classe {

	public static void main(String[] args) {
		
		Classe2 cl1 = new Classe2("Luiz", 99.0); 
		mostrarDadosConta(cl1);
		System.out.println(cl1.getTitular() + " : " + cl1.getSaldo());
		System.out.println(cl1.getTitular() + " : " + cl1.getSaldo());
		
		Classe2 cl2 = new Classe2("Luana", 1099.0);
		mostrarDadosConta(cl2);
		System.out.println(cl2.getTitular() + " : " + cl2.getSaldo());
		cl2.sacar(99.0);
		mostrarDadosConta(cl2);
		System.out.println(cl2.getTitular() + " : " + cl2.getSaldo());
	
	}
	
	private static void mostrarDadosConta(Classe2 c) {
		System.out.println(c.getTitular() + " : " + c.getSaldo());
	}

}
