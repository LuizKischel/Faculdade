package Enum;

public class SorteioMoeda {
	 
	public static NumExer Lancar() {
		double num;
		num = Math.random() * 10;
		if(num >= 5) {
			return NumExer.CARA;
		} else {
			return NumExer.COROA;
		}
	}
}
