package aulaOnze.revisaoMatriz;

import java.util.Random;

public class ExemploTres {
	public static int somaDiagonal(int[][] matriz){
		int soma =0;
		for(int i=0;i<matriz.length;i++){
			soma+=matriz[i][i];
		}
		return soma;
	}
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[10][10];
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				matriz[l][c] = aleatorio.nextInt(200);
				System.out.printf("%03d ",matriz[l][c]);
			}
			System.out.println();
		}
		int somaD = somaDiagonal(matriz);
		System.out.println("A soma dos elementos na diagonal vale "+somaD);
	}
}
