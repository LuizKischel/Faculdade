package ExercicioObjetos;

import java.util.Arrays;

import AulaClassesObjetos.Resultado;

public class MainEx1 {

	public static void main(String[] args) {
		
		
		
		Aula0908Ex1 a1 = new Aula0908Ex1("Luis Estacio Kischel", 14);
		Aula0908Ex1 a2 = new Aula0908Ex1("Luana", 8);
		Aula0908Ex1 a3 = new Aula0908Ex1("Luzia", 12);
		Aula0908Ex1 a4 = new Aula0908Ex1("Luzi", 6);
		
		int[] v4 = { 1, 5, 10, 22, 30, 53 };
		int[] v5 = { 11, 52, 19, 60, 50, 41, 20, 33 };
		int[] v6 = { 15, 43, 32, 52, 37, 48, 12, 26, 33, 60, 54, 1 };
		
		Aula0908Ex1 a7 = new Aula0908Ex1("Luzia", v4);
		Aula0908Ex1 a8 = new Aula0908Ex1("Luzia", v5);
		Aula0908Ex1 a9 = new Aula0908Ex1("Luzia", v6);
		
		int[] sorteados = Resultado.sorteio();
		System.out.print("\nSorteio: ");
		System.out.println(Arrays.toString(sorteados));
		
		int acert = Resultado.acertos(a7, sorteados);
		int acerto = Resultado.acertos(a8, sorteados);
		System.out.println(acert);
		System.out.println(acerto);
	}
		
}
