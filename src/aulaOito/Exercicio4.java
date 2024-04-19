package aulaOito;

import java.util.Random;

/*
Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3 elementos cada,
contendo respectivamente as somas das linhas e das colunas de G. Escrever
os vetores criados.
 */
public class Exercicio4 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[3][3];
		int[] sl = new int[3];
		int[] sc = new int[3];
		for(int l=0;l< matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				matriz[l][c] = aleatorio.nextInt(1,20);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		for(int i=0;i< matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				//[linha][coluna]
				sl[i] = sl[i]+matriz[i][j];
				sc[i] = sc[i]+matriz[j][i];
			}
		}
		System.out.println("A soma das linhas da matriz vale: ");
		for(int i : sl){
			System.out.print(i+" ");
		}
		System.out.println("\nA soma das colunas da matriz vale: ");
		for(int i : sc){
			System.out.print(i+" ");
		}

	}
}
