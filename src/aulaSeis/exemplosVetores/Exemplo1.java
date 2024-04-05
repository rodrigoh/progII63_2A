package aulaSeis.exemplosVetores;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//vetor de 10 elementos com índices de 0 a 9
		//tipo[] nome = new tipo[capacidade]
		int[] vetor = new int[10];
		int tamanho = vetor.length;
		System.out.println("O tamanho do vetor é "+tamanho);
		//int vetorB[] = new int[10];
		for(int i=0;i<vetor.length;i++){
			System.out.print("vetor["+i+"]: ");
			vetor[i] = ler.nextInt();
		}
		for(int i=0;i< vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
