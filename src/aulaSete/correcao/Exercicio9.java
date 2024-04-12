package aulaSete.correcao;

import java.util.Random;

/*
Ler dois vetores: R de 5 elementos e S de 10 elementos. Gerar um
vetor X de 15 elementos cujas 5 primeiras posições contenham os elementos de
R e as 10 últimas posições, os elementos de S. Escrever o vetor X.
 */
public class Exercicio9 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vr = new int[5];
		int[] vs = new int[10];
		int[] vx = new int[15];
		System.out.println("Dados no vetor R");
		for(int i=0;i<vr.length;i++){
			vr[i] = aleatorio.nextInt(1,20);
			System.out.print(vr[i]+" ");
		}
		System.out.println("\nDados no vetor S");
		for(int i=0;i<vs.length;i++){
			vs[i] = aleatorio.nextInt(1,20);
			System.out.print(vs[i]+" ");
		}
		System.out.println("\nDados no vetor X");
		for(int i=0;i<vx.length;i++){
			if(i<5){
				vx[i] = vr[i];
			}
			else{
				vx[i] = vs[i-5];
			}
			System.out.print(vx[i]+" ");
		}
	}
}
