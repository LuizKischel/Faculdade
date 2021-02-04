package Avaliacao2;

import java.util.ArrayList;

public class Loja {
	
	private String nomeLoja;
	private ArrayList<Nacional> produtosNacionais = new ArrayList<>();
	private ArrayList<Importado> produtosImportados = new ArrayList<>();
	
	public Loja (String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	public boolean novoProduto (Nacional produto) {
		if(produtosNacionais.contains(produto)) {
			return false;
		}
		produtosNacionais.add(produto);
		return true;
	}
	
	public boolean novoProduto (Importado produto) {
		if(produtosImportados.contains(produto)) {
			return false;
		}
		produtosImportados.add(produto);
		return true;		
	}
	
	public Nacional nacionalMaisCaro () {
		Nacional maisCaro = null;
		for(Nacional na : produtosNacionais) {
			if(maisCaro == null || na.getPrecoFinal() > maisCaro.getPrecoFinal()) {
				maisCaro = na;
			}
		}
		return maisCaro;
	}
	
	public Importado importadoMaisBarato () {
		Importado maisBarato = null;
		for(Importado im : produtosImportados) {
			if(maisBarato == null || im.getPrecoMinimo() < im.getPrecoMinimo()) {
				maisBarato = im;
			}
		}
		return maisBarato;
	}
	
	public String getNome () {
		return nomeLoja;
	}
	
	
	

}
