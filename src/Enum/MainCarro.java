package Enum;

public class MainCarro {

	public static void main(String[] args) {
		Carro c = new Carro("Corsa", 2006, TipoMotor.COMBUSTAO);
		
		c.setTipoMotor(TipoMotor.COMBUSTAO);
		TipoMotor tm = c.getTipoMotor();
		
		System.out.println(tm.getDescricao());
		
		if(tm == TipoMotor.ELETRICO) {
			
		}
	}

}
