package referencias;

import java.util.ArrayList;
import java.util.Random;

public class ExercicioArraylist {
	
	private String nome;
	private ArrayList<Integer> numeros;
	
	public ExercicioArraylist (String nome, int qntdNumeros) {
		this.nome = nome;
		this.numeros = new ArrayList<>(qntdNumeros);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Random rd = new Random();
		
		int num;
		for (int i = 0; i < qntdNumeros; i++) {
			do {
				num = 1 + rd.nextInt(60); 
			} while (this.numeros.contains(num)); 
			this.numeros.add(num);
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}
	
	public ArrayList<Integer> getNumerosApostados() {
		return new ArrayList<Integer>(numeros);
	}
	
	public String toString() {
		return nome + " " + numeros;
	}

	
	

}
