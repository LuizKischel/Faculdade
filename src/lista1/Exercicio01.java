package lista1;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("escreva um número: ");
		numero = teclado.nextInt();
		int antecessor; 
		int sucessor;
		antecessor = numero - 1;
		sucessor = numero + 1;
		System.out.println("Antecessor: " + antecessor);
		System.out.println("Sucessor: " + sucessor);
	}
		
}


