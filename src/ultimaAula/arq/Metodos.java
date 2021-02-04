package ultimaAula.arq;

public class Metodos {
	
	public static void main(String[] args) {
		
		System.out.println(soma(5));
		System.out.println(somaRec(5));

	}

	private static int soma(int x) {
		int saida = 0;
		while (x > 0) {
			saida += x;
			x--;
		}
		return saida;
	}
	
	private static int somaRec(int x) {
		
		if (x > 0) {
		  return x + somaRec(x-1);
		}
		else {
			return x;
		}
	}

}
