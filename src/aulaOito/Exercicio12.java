package aulaOito;

import java.util.Random;

/*
 Faça um programa para gerar automaticamente números entre
 1 e 99 de uma cartela de bingo. Sabendo que cada cartela
 deverá conter 5 linhas de 5 números, gere estes dados de
 modo a não ter números repetidos dentro das cartelas.
 O programa deve exibir na tela a cartela gerada.

 */
public class Exercicio12 {
	//Retorna true caso seja um novo número e false se já existir
	static boolean buscaNumero(int[][] matriz, int num){
		boolean novoNumero = true;
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				if(num==matriz[l][c])
					novoNumero = false;
			}
		}
		return novoNumero;
	}

	static void mostraMatriz(int[][] matriz) {
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("%02d ", matriz[l][c]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][5];
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[l].length;){
				int num = aleatorio.nextInt(1,76);
				if(buscaNumero(matriz,num)){
					matriz[l][c] = num;
					c++;
				}
			}
		}
		mostraMatriz(matriz);
	}
}
