package Avaliacao2;

import java.util.ArrayList;

public class Usuario {
	private String usuario;
	private ArrayList<String> senhasUtilizadas = new ArrayList<>(5);
	
	public Usuario(String usuario, String senhaInicial) {
		if(usuario != null) {
			this.usuario = usuario;
		}
		else {
			System.out.println("O usuário não pode ser Nulo!");
		}
		if(senhaInicial != null) {
			senhasUtilizadas.add(senhaInicial);
		}
		else {
			System.out.println("A senha não pode ser Nula!");
		}
		
	}
	public boolean loginOK(String senha) {
		if(senha == senhasUtilizadas.get(0)) {
			System.out.println("senha correta");
			return true;
		}
		System.out.println("senha incorreta");
		return false;
	}
	public boolean trocarSenha(String senhaAtual, String senhaNova) {
		if(senhaAtual != senhasUtilizadas.get(0)) {
			System.out.println("Senha atual Incorreta!!!");
			return false;
		}
		if(senhasUtilizadas.contains(senhaNova)) {
			System.out.println("senha igual a uma das 5 ultimas");
			return false;
		}
		else {
			if(senhasUtilizadas.size() > 4) {
				senhasUtilizadas.remove(4);
			}
			if(senhaNova != null) {
				senhasUtilizadas.add(0, senhaNova);
			}			
			return true;
		}
	}
	public String getUsuario() {
		return usuario;
	}
}

