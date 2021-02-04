package figuras;

public abstract class Figura {
	private String nome;

	public Figura(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}
