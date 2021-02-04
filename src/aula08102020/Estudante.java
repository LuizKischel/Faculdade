package aula08102020;

public class Estudante extends Pessoa{
	
	public Estudante(String nome) {
		super(nome);
	}

	public Estudante(String nome, int idade) {
		super(nome, idade);
	}	
	
	public void estudar(String assunto) {
		System.out.println("Estou estudando o assunto " + assunto);
	}

}
