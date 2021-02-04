package AV3.Questao2;

public class Sequencia implements Imprimivel {

	private int inicio;
	private int fim;
	
	public Sequencia(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	@Override
	public String formatoImpressao() {
		String form;		
		do {
			inicio += 1;
			form = inicio + ", ";
			return form;
		}while(inicio != fim);
	}

}
