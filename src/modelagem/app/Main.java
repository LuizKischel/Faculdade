package modelagem.app;

import figuras.Cubo;
import figuras.Esfera;
import figuras.Figura;
import figuras.Figura2d;
import figuras.Figura3d;
import modelagem.classes.Paralelograma;
import modelagem.classes.Quadrado;
import modelagem.classes.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Cubo cubo = new Cubo("cubo", 6.0);
		System.out.println(cubo.getVolume());
		System.out.println(cubo.getNome());
		
		Esfera esf = new Esfera("Esfera", 3.0);
		System.out.println(esf.getVolume());
		
		Figura fig;
		Figura3d fg3d;
		Figura2d fg2d;
		Paralelograma p;
		
		Retangulo ret = new Retangulo("Retang", 3.0, 3.0);
		System.out.println(ret.getPerimetro());
		System.out.println(ret.getArea());
		System.out.println(ret.getNome());
		
		Quadrado qua = new Quadrado("Quadrado", 5);
		System.out.println(qua.getNome());
		System.out.println(qua.getArea());
		System.out.println(qua.getPerimetro());	
		
		

	}

}
