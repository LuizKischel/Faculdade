package RevisaoAV3.Exercicio2;

public class Chuveiro {
	
	private int niveisTemperatura;
	private int nivelAtual;
	
	public Chuveiro(int niveisTemperatura) {
		this.niveisTemperatura = 3;
		nivelAtual = 1;
	}
	
	public int getNivelAtual() {
		return nivelAtual;
	}
	
	public void aumentarTemperatura() {
		if(nivelAtual == 1 || nivelAtual == 2) {
			nivelAtual += 1;
			System.out.println(nivelAtual);
		}  
		else {
			System.out.println("Nivel no Máximo");
		}
	}
	
	public void diminuirTemperatura() {
		if(nivelAtual == 3 || nivelAtual == 2) {
			nivelAtual -= 1;
		} else {
			System.out.println("Nível no Mínimo");
		}			
	}
	
	public void aumentarMaximo() {
		nivelAtual = 3;	
	}
	
	public void diminuirMinimo() {
		nivelAtual = 1;
	}

}
