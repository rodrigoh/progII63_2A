package aulaDois.exemplos;

import java.util.Scanner;
public class ExemploUm {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		System.out.println("O número é "+numero);
		float raio = 5;

		float area = (float)(Math.pow(raio,2)*Math.PI);
		area = raio*raio*(float)Math.PI ;

		float numeroR;
		System.out.print("Digite um número real: ");
		numeroR = ler.nextFloat();
		System.out.println("O número é "+numeroR);
		System.out.printf("O número é %.2f\n",numeroR);

	}
}
