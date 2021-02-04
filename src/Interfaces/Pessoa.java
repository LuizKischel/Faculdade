package Interfaces;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idade, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        return idade == other.idade && Objects.equals(nome, other.nome);
    }

    @Override
    public String toString() {
        return nome + "/" + idade;
    }

	@Override
	public int compareTo(Pessoa o) {
		int result = this.nome.compareTo(o.nome);
		if(result == 0) {
			result = this.idade - idade;
		}
		
		return result;
	}

}
