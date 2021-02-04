package modelagem.classes;

import figuras.Figura;

public abstract class Figura3d extends Figura {
	
	public Figura3d (String nome) {
		super(nome);
	}

	public abstract double getVolume();
		
}
