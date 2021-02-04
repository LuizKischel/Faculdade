package Enum;

public enum TipoMotor {
	COMBUSTAO("Combustão"),
	ELETRICO("Elétrico"),
	HIBRIDO("Híbrido");
	
	private String descricao;
	
	private TipoMotor(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
}
