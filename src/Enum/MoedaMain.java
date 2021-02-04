package Enum;

public class MoedaMain {

	public static void main(String[] args) {
		
		int cara = 0;
		int coroa = 0;
		int numJogadas = 1000;
		
		for (int i = 0; i < numJogadas; i++) {
			if(SorteioMoeda.Lancar() == NumExer.CARA) {
				cara++;
			} else {
				coroa++;
			}
		}
		
		System.out.println("Cara: " + cara);
		System.out.println("Coroa: " + coroa);

	}

}
