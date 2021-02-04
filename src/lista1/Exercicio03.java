package lista1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ferraduras = 4;
		int cavalos;
		int total;
		System.out.println("Quantidade de cavalos: ");
		cavalos = teclado.nextInt();
		total = cavalos * ferraduras;
		System.out.println("Total de Ferraduras: " + total);

	}

}
