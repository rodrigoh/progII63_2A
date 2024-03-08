package aulaTres.exemploSwitchCase;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu perfil: ");
		String perfil = ler.next();
		switch(perfil){
			case "admin" -> System.out.println("Perfil de administrador");
			case "usuario"-> System.out.println("Peril de usuário");
			default -> System.out.println("Perfil de visitante");
		}
	}
}
