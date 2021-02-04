package RevisaoAV3;

import java.util.ArrayList;

public class ReceptorTVCabo extends Aparelho implements ControlarCanal {

	private String provedor;
	ArrayList<Integer> favoritos;
	private int canalAtual;
	
	public ReceptorTVCabo(String marca, String modelo, String provedor) {
		super(marca, modelo);
		this.provedor = provedor;
		favoritos = new ArrayList<>(10);
		this.canalAtual = 1;
	}
	
	@Override
	public int getCanal() {
		return canalAtual;
	}
	
	@Override
	public void setCanal (int canal) {
		this.canalAtual = canal;
	}
	
	@Override
	public void canalMais() {
		setCanal(canalAtual + 1);
	}

	@Override
	public void canalMenos() {
		setCanal(canalAtual - 1);
	}
	
	public int adicionarFavorito() {
		if(favoritos.size() < 10) {
			favoritos.add(canalAtual);
			return favoritos.size();
		}
		return -1;
	}
	
	public boolean removerFavorito() {
		return favoritos.remove(Integer.valueOf(canalAtual));		
	}
	
	public void selecionarFavorito(int numero) {
		if(numero > 0 && numero <= favoritos.size()) {
			setCanal(favoritos.get(numero - 1));
		}
	}
	
	public String getProvedor() {
		return provedor;
	}
	

}
