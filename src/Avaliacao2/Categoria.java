package Avaliacao2;

public enum Categoria {
	ARTESANAL("Artesanal"),
	INDUSTRIALIZADO("Industrializado");

	private String descricao;
	
	private Categoria(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}	
}
