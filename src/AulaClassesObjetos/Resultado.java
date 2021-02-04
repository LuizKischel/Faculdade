package AulaClassesObjetos;

import java.util.Arrays;
import java.util.Random;

import ExercicioObjetos.Aula0908Ex1;

public class Resultado {
	
	private Resultado() {};
	
	private static int[] vetResultado;
	
	public static int[] sorteio() {
		if(vetResultado == null) {
			vetResultado = new int[6];
			Random rand = new Random();
			int num;
			for (int i = 0; i < vetResultado.length; i++) {
				do {
					num = 1 + rand.nextInt(60);
				}while (jaTem(num));
				vetResultado[i] = num;
			}
		}
			return vetResultado;
	}
	
	private static boolean jaTem(int n) {
		for(int x : vetResultado) {
			if (x == n) {
				return true;
			}
		}
		return false;
	}
	
	public static int acertos (Aula0908Ex1 aposta, int[] resultado) {
		int acertos = 0;
		for (int res : resultado) {
			int[] numeros = aposta.getNumeros();
			for(int n : numeros) {
				if (n == res) {
					acertos++;
					break;
				}
			}			
		}
		return acertos;
	}
}
