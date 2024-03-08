package aulaTres.exemploSwitchCase;

import java.util.Scanner;

public class ExemploDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 7: ");
		int dia = ler.nextInt();
		//1 = domingo
		//7 = sábado
		switch(dia){
			case 1, 7 -> System.out.println("É fim de semana");
			case 2, 3, 4, 5, 6 -> {
				System.out.println("É dia útil");
				System.out.println("outro comando...");
			}
			default -> System.out.println("Número inválido");
		}
	}
}
