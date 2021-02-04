package RevisaoAV3.Exercicio2;

public class SecadorCabelo implements ControleTemperatura {

	private Temp inicial;
	
	public SecadorCabelo() {
		this.inicial = Temp.BAIXO;
	}
	
	@Override
	public void aumentarTemperatura() {
		if(inicial == Temp.BAIXO) {
			inicial = Temp.MEDIO;
			System.out.println("Temperatura M�dia");
		}
		
		else if(inicial == Temp.MEDIO) {
			inicial = Temp.ALTO;
			System.out.println("Temperatura Alta");
		} 
		else if(inicial == Temp.ALTO){
			System.out.println("A temperatura est� alta!!!");
		}
		
	}
	
	@Override
	public void diminuirTemperatura() {
		if(inicial == Temp.BAIXO) {
			System.out.println("A temperatura j� est� Baixa");
		}
		
		else if(inicial == Temp.MEDIO) {
			inicial = Temp.BAIXO;
			System.out.println("Temperatura Baixa");
		} 
		else if(inicial == Temp.ALTO){
			inicial = Temp.MEDIO;
			System.out.println("Temperatura M�dia");
		}
		
	}
	
	@Override
	public void aumentarMaximo() {
		inicial = Temp.ALTO;
		System.out.println("Temperatura no Maximo");		
	}
	
	@Override
	public void diminuirMinimo() {
		inicial = Temp.MEDIO;
		System.out.println("Temperatura no M�nimo");
	}
	
	public Temp getPosicao() {
		return inicial;
	}

}
