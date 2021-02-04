package RPavalicao2;

public enum FormaEntrega {
	
	DELIVERY("DELIVERY"),
	BALCAO("BALCAO");
	
	private String formaEntrega;
	
	private FormaEntrega(String formaEntrega) {
		this.formaEntrega = formaEntrega;
	}
	
	@Override
	public String toString() {
		return formaEntrega;
	}

}
