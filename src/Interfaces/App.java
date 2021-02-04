package Interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> palavras = new ArrayList<>();
		
		palavras.add("Olá");
		palavras.add("Texto");
		palavras.add("Linha");
		palavras.add("Casa");
		
		System.out.println(palavras);
		
		Collections.sort(palavras);
		System.out.println(palavras);
		
		String s = "x";
		String t = "y";
		
		System.out.println("teste".compareTo("xyz"));
		System.out.println("teste".compareTo("abc"));
		System.out.println("teste".compareTo("teste"));
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Luiz", 19));
		pessoas.add(new Pessoa("Luana", 18));
		pessoas.add(new Pessoa("Adriana", 41));
		pessoas.add(new Pessoa("Leonides", 48));
		pessoas.add(new Pessoa("Lucas", 2));
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas);
		
		
		
	}

}
