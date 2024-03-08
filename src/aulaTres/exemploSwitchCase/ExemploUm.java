package aulaTres.exemploSwitchCase;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 7: ");
		int dia = ler.nextInt();
		//1 = domingo
		//7 = sábado
		switch(dia){
			case 1, 7:
				System.out.println("Fim de semana");
				break;
			case 2, 3, 4, 5, 6:
				System.out.println("Dia útil");
				System.out.println("outro comando...");
				break;
			default:
				System.out.println("Número inválido");
		}
	}
}
