package aula15102020;

import java.util.ArrayList;
import java.util.Objects;

public class Consumidor {
	
	private String nome;
	private ArrayList<ContaAgua> contaAgua;
	private ArrayList<ContaEletricidade> contaEletricidade;
	private ArrayList<ContaTelefone> contaTelefone;
	
	public Consumidor (String nome) {
		this.nome = Objects.requireNonNull(nome);
		this.contaAgua = new ArrayList<>();
		this.contaEletricidade = new ArrayList<>();
		this.contaTelefone = new ArrayList<>();
	}
	
	public String getNome () {
		return nome;
	}
	
	public Status novaConta (ContaTelefone ct) {
		if (!this.equals(ct.getConsumidor())) 
			return Status.CONSUMIDOR_INCORRETO;
		
		
		if (contaTelefone.contains(ct)) 
			return Status.CONTA_DUPLICADA;
		
		
		contaTelefone.add(ct);
		return Status.CONTA_ACEITA;
		
	}
	
	public Status novaConta (ContaEletricidade ce) {
		if (!this.equals(ce.getConsumidor())) 
			return Status.CONSUMIDOR_INCORRETO;
		
		
		if (contaEletricidade.contains(ce)) 
			return Status.CONTA_DUPLICADA;
		
		contaEletricidade.add(ce);
		return Status.CONTA_ACEITA;
	}
	
	public Status novaConta (ContaAgua ca) {
		if (!this.equals(ca.getConsumidor())) 
			return Status.CONSUMIDOR_INCORRETO;
		
		if (contaAgua.contains(ca)) 
			return Status.CONTA_DUPLICADA;
		
		contaAgua.add(ca);
		return Status.CONTA_ACEITA;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
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
		Consumidor other = (Consumidor) obj;
		return Objects.equals(nome, other.nome);
	}	
}
