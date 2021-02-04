package Prova1;

public class Questao2 {
	
	public static int[] inverso (int[] vetor) {
		int cont = vetor.length -1;
		int[] vet = new int[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
			vet[cont] = vetor[i];
			cont--;
		}
		return vet;
	}
	
	public static String junto (char[] carac) {
		String palavra = "";
		for (int i = 0; i < carac.length; i++) {
			palavra = palavra + carac[i];
		}
		return palavra;
	}
}
