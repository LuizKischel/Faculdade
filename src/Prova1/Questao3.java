package Prova1;

import java.util.Random;

public class Questao3 {
	
	public String lancarDados (int qntLancamento) {
		if (qntLancamento >= 150000 || qntLancamento <= 1) {
			System.out.println("Quantidade de lançamento errada!!!");
			System.exit(0);
		}
		String Resultado;
		long rodada = 0;
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int cont5 = 0;
		int cont6 = 0;
		Random rand = new Random();
		for (int i = 0; i < qntLancamento; i++) {
			rodada = 1 + rand.nextInt(6);
			if(rodada == 1) {
				cont1++;
			}
			else if(rodada == 2) {
				cont2++;
			}
			else if(rodada == 3) {
				cont3++;
			}
			else if(rodada == 4) {
				cont4++;
			}
			else if(rodada == 5) {
				cont5++;
			}
			else {
				cont6++;
			}
		}
		Resultado = ("Quantidade de números sorteados: \nnúmero 1: " + cont1 + "\nnúmero 2: " + cont2 + "\nnúmero 3: " + cont3 + "\nnúmero 4: " + cont4 + "\nnúmero 5: " + cont5 + "\nnúmero 6: " + cont6);
		return Resultado;
	}
}
