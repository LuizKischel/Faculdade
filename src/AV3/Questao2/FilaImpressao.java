package AV3.Questao2;

import java.util.ArrayList;

public class FilaImpressao {

	private ArrayList<Imprimivel> docs = new ArrayList<>();
	
	public FilaImpressao() {
		
	}
	
	public void incluirNaFila(Imprimivel fila) {
		int tamanho = docs.size();
		docs.add(tamanho, fila);
	}
	
	public void imprimirTodos() {
		Impressora im = new Impressora();
		for(Imprimivel doc : docs) {
			im.imprimir(doc);
		}
	}

}
