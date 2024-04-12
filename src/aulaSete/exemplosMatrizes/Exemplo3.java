package aulaSete.exemplosMatrizes;

import java.util.Random;

public class Exemplo3 {
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		Random aleatorio = new Random();
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz.length;c++){
				matriz[l][c] = aleatorio.nextInt(50);
				if(l==c)
					System.out.printf("%02d ",matriz[l][c]);
			}
			//  System.out.println();
		}
	}
}
