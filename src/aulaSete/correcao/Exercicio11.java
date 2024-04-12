package aulaSete.correcao;

import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Random aleatoria = new Random();
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		int tamanho = vetor.length;
		for(int i=0;i<tamanho;i++){
			vetor[i] = aleatoria.nextInt(30);
			System.out.print(vetor[i]+" ");
		}
		System.out.print("\nQual número da lista deseja remover: ");
		int remover = ler.nextInt();
		//Buscando o número da lista
		int posicao = -1;
		for(int i=0;i<tamanho;i++){
			if(vetor[i]==remover){
				posicao = i;
			}
		}
		if(posicao>=0){
			for(int i=posicao;i<tamanho-1;i++){
				vetor[i] = vetor[i+1];
			}
			tamanho--;
			System.out.println("\nDados na lista: ");
			for(int i=0;i<tamanho;i++){
				System.out.print(vetor[i]+" ");
			}
		}
		else{
			System.out.println(remover+" não está na lista");
		}
	}
}
