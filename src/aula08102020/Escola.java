package aula08102020;

import java.util.ArrayList;
import java.util.Objects;

public class Escola {
	
	private String nomeEscola;
	private ArrayList<Professor> professores;
	private ArrayList<Estudante> estudantes;
	
	public Escola (String nomeEscola) {
		this.nomeEscola = nomeEscola;
		this.professores = new ArrayList<>();
		this.estudantes = new ArrayList<>();
	}
	
	public ArrayList<Professor> getProfessores () {
		return professores;
	}
	
	public ArrayList<Estudante> getEstudantes () {
		return estudantes;
	}
	
	public boolean matricular (Estudante al) {
		for(Estudante est : estudantes) {
			if (Objects.equals(al, est)) {
				return false;
			}
		}
		return estudantes.add(al);
		
	}
	
	public boolean contratar (Professor prof) {
		
		if(professores.contains(prof)) return false;
		
		for(Professor pr : professores) {
			if (prof.equals(pr)) {
				return false;
			}
		}
		return professores.add(prof);
		
	}
	
	public String getNomeEscola () {
		return nomeEscola;
	}
	
	public void setNomeEscola (String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
}
