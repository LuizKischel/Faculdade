package ExercicioObjetos;

import java.util.Arrays;
import java.util.Random;

public class Aula0908Ex1 {
	private String nome;
	private int[] aposta;
	
	public Aula0908Ex1(String nome, int qnt) {
		this.nome = nome;
		this.aposta = new int[qnt];
		Random rand = new Random();
		int num;
		for (int i = 0; i < this.aposta.length; i++) {
			do {
				num = 1 + rand.nextInt(60);
			} while(jaTem(num));
			this.aposta[i] = num;
		}
		System.out.println(Arrays.toString(this.aposta));
	}
	
	private boolean jaTem(int n) {
		for (int x : this.aposta) {
			if ( x == n ) {
				return true;
			}
		}
		return false;
	}
	
	public Aula0908Ex1(String nome, int[] aposta) {
		this.nome = nome;
		this.aposta = aposta;
	}
	
	public int[] getNumeros( ) {
		return aposta;
	}
	
	public String getNome() {
		return nome;
	}


}
