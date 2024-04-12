package aulaSete.exemplosMatrizes;

public class Exemplo2 {
	public static void main(String[] args) {
		int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
//		System.out.println("\nfor simplificado");
//		int[] vetor = {1,2,3,4};
//		for(int i : vetor){
//			System.out.print(i+" ");
//		}
		System.out.println("\nDados na matriz:");
		for(int[] linha : matriz){
			for(int c : linha){
				System.out.printf("%02d ",c);
			}
			System.out.println();
		}
	}
}
