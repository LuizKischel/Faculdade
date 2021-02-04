package Prova1;

import java.util.Arrays;

public class Questao1 {
	private String nome;
	private long[] cpf;
	
	public Questao1 (String nome, long[] cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getCpf(long[] vetor) {
		String a = "";
		for (int i = 0; i < vetor.length; i++) {
			if (i < 3) {
				a += vetor[i];
			}
			if(i == 3) {
				a += ".";
				a += vetor[i];
			}
			else if (i > 2 && i < 6) {
				a += vetor[i];
			}
			if(i == 6) {
				a += ".";
				a += vetor[i];
			}
			else if (i > 6 && i < 9) {
				a += vetor[i];
			}
			if(i == 9) {
				a += "-";
				a += vetor[i];
			}
			else if (i > 9 && i < 11) {
				a += vetor[i];
			}
			
		}
		return a;
		
	}
	
	public boolean MaiorIdade(int idade) {
		if (idade >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int Idade (int ano) {
		int idade;
		idade = 2020 - ano;
		return idade;
	}	
}
