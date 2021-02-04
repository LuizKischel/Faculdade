package Enum;

public enum TipoMotor {
	COMBUSTAO("Combust�o"),
	ELETRICO("El�trico"),
	HIBRIDO("H�brido");
	
	private String descricao;
	
	private TipoMotor(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
}
