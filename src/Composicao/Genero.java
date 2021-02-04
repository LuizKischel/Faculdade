package Composicao;

public enum Genero {
	FICCAO("Fic��o"),
	TERROR("Terror"),
	CONTO("Conto"),
	TECNICO("T�cnico");
	
	private String descricao;
	
	private Genero (String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	
}
