package aula08102020;

public class main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Pessoa");
		p.setIdade(18);		
		
		Estudante e1 = new Estudante("Alfredo");
		e1.setIdade(25);
		e1.oi();
		e1.estudar("Logica");
		
		Professor p2 = new Professor("Jo�o", 20);
		
		Professor p1 = new Professor("Jo�o", 20);
		p1.explicar("L�gica");
		
		p1.oi();
		
		Escola e2 = new Escola("Jo�o Widemann");
		e2.contratar(p1);
		e2.contratar(p2);
		
		System.out.println("Ol�, meu nome � Renato!!!");
		
		
		
	

	}

}
