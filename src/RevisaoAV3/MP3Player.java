package RevisaoAV3;

import java.util.ArrayList;
import java.util.Random;

public class MP3Player extends Aparelho implements ControlarReproducao{

	private int capacidade;
	ArrayList<String> musicas;
	private int selecionada;
	private boolean tocando;
	
	public MP3Player(String marca, String modelo, int selecionada) {
		super(marca, modelo);
		musicas = new ArrayList<>();
		this.selecionada = -1;		
		this.capacidade = capacidade;
	}
	
	@Override
	public void play() {
		if(selecionada >=0 ) {
			tocando = true;
			System.out.println("Tocando musica: " + musicas.get(selecionada));
		} else {
			System.out.println("Nenenhuma musica selecionada");
		}
	}
	
	@Override
	public void pause() {
		if(tocando) {
			tocando = false;
			System.out.println("Pausa na música: " + musicas.get(selecionada));
		} else {
			System.out.println("Nenhuma musica selecionada");
		}
	}
	
	@Override
	public void stop() {
		
	}

	public int getCapacidade() {
		return capacidade;
		
	}
	
	public int carregarMusica(String musica) {
		if(musicas == null) {
			this.musicas = new ArrayList<>();
		}
		if(musicas.size() < capacidade) {
			musicas.add(musica);
			return musicas.size();
		}
		return -1;
	}
	
	public int carregarMusicaAleatoria() {
		if(musicas.size() > 0) {
			Random rd = new Random();
			int m = rd.nextInt(musicas.size());
			return m;
		}
		return -1;
	}
	
	public void selecionarMusica(int musica) {
		if((musica >= 0) && (musica < musicas.size())) {
			selecionada = musica;
			System.out.println("Música selecionada: " //
					+ musica + " - " + musicas.get(selecionada));
		} else {
			System.out.println("Não é possível selecionar a música: " + musica);
		}
	}
	
	public void proxima() {
		selecionarMusica(selecionada + 1);
	}
	
	public void anterior() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
