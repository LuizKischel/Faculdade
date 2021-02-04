package Composicao;

public class livro {
	
	private Autor autor;
	private Genero genero;
	private String titulo;
	private int ano;
	
	public livro (Autor autor, String titulo, int ano, Genero genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.genero = genero;
	}
	
	public Autor getAutor () {
		return autor;
	}
	
	public String getTitulo () {
		return titulo;
	}
	
	public int getAno () {
		return ano;
	}
	
	public Genero getGenero () {
		return genero;
	}
	
	@Override
	public String toString() {
		return autor + ": " + titulo + ", " + ano + " - " + genero;
	}
}
