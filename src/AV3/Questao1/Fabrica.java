package AV3.Questao1;

import java.util.ArrayList;

public class Fabrica {
	
	private final String marca = "Citroen";
	private ArrayList<Veiculo> veiculos = new ArrayList<>();
	
	public Fabrica(String marca) {
	
	}
	
	public final String getMarca() {
		return marca;
	}
	
	public final ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	
	public void construirVeiculoCarga (String modelo, int carga) {
		veiculos.add(new Carga(this.marca, modelo, carga)); 
	}
	
	public void construirVeiculoTransporte (String modelo, int pessoas) {
		veiculos.add(new Transporte(this.marca, modelo, pessoas));
	}
	
	public void construirVeiculoCorrida (String modelo, double velocidadeMaxima) {
		veiculos.add(new Corrida(this.marca, modelo, velocidadeMaxima));
	}
	
	public int qtVeiculosCarga() {
		int qt = 0;
		for(Veiculo ca : veiculos) {
			if(ca instanceof Carga) {
				qt =+ 1;
			}
		}
		return qt;
		
	}
	
	public int qtVeiculosTransporte() {
		int qt = 0;
		for(Veiculo tr : veiculos) {
			if(tr instanceof Transporte) {
				qt =+ 1;
			}
		}
		return qt;
		
	}
	
	public int qtVeiculosCorrida() {
		int qt = 0;
		for(Veiculo co : veiculos) {
			if(co instanceof Corrida) {
				qt =+ 1;
			}
		}
		return qt;	
	}
}
