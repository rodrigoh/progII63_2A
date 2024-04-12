package aulaSete.exemplosMatrizes;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//tipo[][] nome = new tipo[linhas][colunas]
		int[][] matriz = new int[3][4];
		for(int l=0;l<3;l++){
			for(int c=0;c<4;c++){
				System.out.printf("matriz[%d][%d]: ",l,c);
				matriz[l][c] = ler.nextInt();
			}
		}
		System.out.println("\nDados na matriz:");
		for(int l=0;l<3;l++){
			for(int c=0;c<4;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		int linhas = matriz.length;
		System.out.println("A quantidade de linhas da matriz é "+linhas);
		int colunas = matriz[0].length;
		System.out.println("A quantidade de colunas da matriz é "+colunas);
	}
}
