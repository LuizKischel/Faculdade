package AV3.Questao2;

public class Arquivo implements Imprimivel {

	private String nomeArquivo;
	private String conteudo;
	
	public Arquivo(String nomeArquivo, String conteudo) {
		this.nomeArquivo = nomeArquivo;
		this.conteudo = conteudo;
	}
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setContudo(String conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String formatoImpressao() {
		return conteudo;
	}
}
