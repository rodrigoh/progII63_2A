package aula22.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploDois {
	public static int leNumero(String mensagem){
		Scanner ler = new Scanner(System.in);
		boolean correto = false;
		int numero = 0;
		do{
			try{
				System.out.print(mensagem+": ");
				numero = ler.nextInt();
				correto = true;
			}
			catch (InputMismatchException e){
				System.out.println("O valor precisa ser numérico");
				ler.next();
				correto = false;
			}
		}
		while(!correto);
		return numero;
	}

	public static void main(String[] args) {
		int n1 = leNumero("Digite um número");
	}
}
