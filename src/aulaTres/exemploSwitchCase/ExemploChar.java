package aulaTres.exemploSwitchCase;

import java.util.Scanner;

public class ExemploChar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		char letra = ler.next().charAt(0);
		//Converte para minúsculo e pega a primeira letra
		letra = ler.next().toLowerCase().charAt(0);
		//Converte para maiúsculo e pega a primeira letra
		letra = ler.next().toUpperCase().charAt(0);

		String nome = "Ana";
		nome = nome.toUpperCase();
		System.out.println(nome);
	}
}
