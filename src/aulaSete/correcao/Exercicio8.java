package aulaSete.correcao;

import java.util.Scanner;

/*
Ler um vetor X de 10 elementos. A seguir copiar todos os valores
negativos do vetor X para um vetor R, sem deixar elementos vazios
entre os valores copiados. Escrever o vetor X e o vetor R.
 */
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vx = new int[10];
		int[] vr = new int[10];
		int cr = 0;
		for(int i =0; i< vx.length;i++){
			System.out.print("vx["+i+"]: ");
			vx[i] = ler.nextInt();
			if(vx[i]<0){
				vr[cr] = vx[i];
				cr++;
			}
		}
		System.out.print("\nDados no vetor r (números negativos)\n");
		for(int i=0;i<cr;i++){
			System.out.print(vr[i]+" ");
		}
	}
}
