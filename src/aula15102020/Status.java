package aula15102020;

public enum Status {
	
	CONTA_ACEITA("Conta aceita!"),
	CONTA_DUPLICADA("Conta duplicada!"),
	CONSUMIDOR_INCORRETO("Consumidor incorreto!");
	
	private String status;
	
	private Status (String status) {
		this.status = status;
	}
	
	public String getStatus () {
		return status;
	}

}
