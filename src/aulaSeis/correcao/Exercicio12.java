package aulaSeis.correcao;

import java.util.Scanner;

/*
Escreva um algoritmo que leia um número e diga se ele é primo ou não.

 */
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int num = ler.nextInt();
		int contDiv = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				contDiv++;
			}
		}
		if(contDiv==2){
			System.out.println(num+" é primo");
		}
		else{
			System.out.println(num+" não é primo");
		}
	}
}
