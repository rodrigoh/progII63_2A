package aulaCinco.exemploRepeticao;

import java.util.Scanner;

public class ExemploDoWhile4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char resp;
		do{
			//...
			System.out.print("Deseja continuar s - sim, n - não ");
			resp = ler.next().charAt(0);
		}
		while (resp=='s');
	}
}
