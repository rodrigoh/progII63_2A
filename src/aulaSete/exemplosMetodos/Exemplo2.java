package aulaSete.exemplosMetodos;

import java.util.Random;

public class Exemplo2 {

	static int somaVetor(int[] vetor){
		int soma=0;
		for(int i=0;i<vetor.length;i++){
			soma+=vetor[i];
		}
		return soma;
	}

	static void geraVetor(int[] vetor){
		Random aleatorio = new Random();
		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(20);
		}
	}
	public static void main(String[] args) {
		int[] lista = {1,4,5,9};
		int soma = somaVetor(lista);
		System.out.println(soma);
		int[] novoVetor = new int[10];
		geraVetor(novoVetor);
		for(int i=0;i<novoVetor.length;i++){
			System.out.print(novoVetor[i]+" ");
		}
	}
}
