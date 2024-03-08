package aulaTres.exemploIf;

import java.util.Scanner;

public class ExemploTres {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu perfil: ");
		String perfil = ler.next();
		if(perfil.equals("admin")){
			System.out.println("Perfil administrador");
		}
		else if(perfil.equals("usuario")){
			System.out.println("Perfil usuário");
		}
		else{
			System.out.println("Perfil visitante");
		}
	}
}
