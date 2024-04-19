package aulaCinco.exemploRepeticao;

import java.util.Scanner;

public class ExemploDoWhile3 {
	public static void main(String[] args) {
		//Ler uma nota entre 0 e 10;
		// nota>=0 && nota<=10
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma nota: ");
		int nota = ler.nextInt();
		while(nota<0 || nota>10){
			System.out.print("Nota inválida, digite outra: ");
			nota = ler.nextInt();
		}
		System.out.println("\nExemplo com do..while");
		int notaDois;
		do{
			System.out.print("Digite uma nota: ");
			notaDois = ler.nextInt();
			if(notaDois<0 || notaDois>10)
				System.out.println("Nota inválida");
		}
		while (notaDois<0 || notaDois>10);
	}
}
