package aula08102020;

import java.util.Objects;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setIdade(int idade)  {
		this.idade = idade;
	}
	
	public int getIdade () {
		return this.idade;
	}

	public String getNome () {
		return nome;
	}
	
	public void oi() {
		System.out.println("Olá, eu me chamo " + nome + " e tenho " + idade + " anos.");
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pessoa other = (Pessoa) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}

	
	
	
	
	
	
}
