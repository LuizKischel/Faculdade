package lista1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int base;
		int altura;
		int area;
		System.out.println("Informe a Base do Ret�ngulo: ");
		base = teclado.nextInt();
		System.out.println("Informe a altura do Ret�ngulo: ");
		altura = teclado.nextInt();
		area = base * altura;
		System.out.println("A �rea �: " + area);
		

	}

}
