package aulaSete.correcao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		for(int i=0;i< vetor.length;i++){
			System.out.print("Digite um número para vetor["+i+"]: ");
			vetor[i] = ler.nextInt();
		}
		System.out.print("Qual número devo procurar no vetor: ");
		int busca = ler.nextInt();
		boolean achei = false;
		for(int i=0;i<vetor.length;i++){
			if(vetor[i]==busca)
				achei=true;
		}
		if(achei){
			System.out.println("O valor "+busca+" está no vetor");
		}
		else{
			System.out.println("O valor "+busca+" não está no vetor");
		}
	}
}
