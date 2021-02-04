package Composicao;

public class MainAutor {

	public static void main(String[] args) {
		Autor au = new Autor("Luiz", "Kischel");
		System.out.println(au);
		
		Genero gen = Genero.FICCAO;
		System.out.println(gen);
		
		String tit = "O mar";
		
		livro liv = new livro(au, tit, 2000, gen.TERROR);
		System.out.println(liv);
	}

}
