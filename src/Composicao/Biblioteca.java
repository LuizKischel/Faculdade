package Composicao;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nome;
	private ArrayList<livro> acervo;
	
	public Biblioteca (String nome) {
		this.nome = nome;
		this.acervo = new ArrayList<>();
	}
	
	public String getNome () {
		return nome;
	}
	
	public ArrayList<livro> getAcervo () {
		return acervo;
	}
	
	public ArrayList<livro> getAcervo(Genero gen) {
		ArrayList<livro> livrosGenero = new ArrayList<>();
		for (livro li : acervo) {
			if (li.getGenero() == gen) {
				livrosGenero.add(li);
			}
		}
		return livrosGenero;
	}
	
	public void incluirLivro (livro livro) {
		acervo.add(livro);
	}
}
