package aulaSeis.exemplosVetores;

import java.util.Random;

public class Exemplo3 {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int numero = aleatorio.nextInt();
		System.out.println(numero);

		numero = aleatorio.nextInt(10);
		System.out.println(numero);

		numero = aleatorio.nextInt(10,100);
		System.out.println(numero);

		boolean flag = aleatorio.nextBoolean();
		System.out.println(flag);

		int[] vetor = new int[10];
		for(int i = 0; i < vetor.length; i++){
			vetor[i] = aleatorio.nextInt(10,100);
			System.out.print(vetor[i]+" ");
		}
	}
}
