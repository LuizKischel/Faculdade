package Prova1;

import java.util.Arrays;
import java.util.Scanner;

public class QuestaoMain {

	public static void main(String[] args) {
		
		
		long[] cpf = {0, 5, 0, 7, 8, 8, 8, 3, 9, 1, 6};
		
		Questao1 Ques = new Questao1("Luana", cpf);
		//long[] teste = Ques.getCpf(cpf);
		//System.out.println(Arrays.toString(teste));
		
		System.out.println(Ques.getCpf(cpf));
		
		/*
		int[] vet = {5, 4, 3, 2, 1};
		int[] vetor = Questao2.inverso(vet);
		System.out.println(Arrays.toString(vetor));
		
		char[] carac = {'L', 'u', 'i', 'z'};
		System.out.println(Questao2.junto(carac));
		
		Scanner teclado = new Scanner(System.in);
		int qntdLancamento = 1;
		
		Questao3 Ques3 = new Questao3();
		System.out.println(Ques3.lancarDados(qntdLancamento));
		*/
		
		
	}

}
