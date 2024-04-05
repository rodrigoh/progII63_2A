package aulaSeis.correcao;

import java.util.Scanner;

/*
Uma loja está levantando o valor total de todas as mercadorias em
estoque. Escreva um algoritmo que permita a entrada das seguintes
informações:
a) Número total de mercadorias no estoque (quantidade total).
b) Valor de cada mercadoria.
Ao final imprimir o valor total em estoque e a média de valor das
mercadorias

O mesmo exercício anterior, mas agora não será informado o número
de mercadorias em estoque. Então o funcionamento deverá ser da
seguinte forma: ler o valor da mercadoria e perguntar
“MAIS MERCADORIAS (S/N)?”. Ao final, imprimir o valor total em
estoque e a média de valor das mercadorias em estoque.

 */
public class Exercicio16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int quant = 0;
		float valorTotal = 0;
		char resp;
		do{
			System.out.print("Digite o valor da "+(quant+1)+"° mercadoria : ");
			float valor = ler.nextFloat();
			valorTotal = valorTotal+valor;
			System.out.println("Tem mais mercadorias? [S/N]");
			resp = ler.next().toLowerCase().charAt(0);
			quant++;
		}
		while (resp=='s');
		float valorMedio = valorTotal/quant;
		System.out.printf("O estoque tem um total de %d mercadorias e vale R$%.2f\n",quant,valorTotal);
		System.out.printf("O preço médio das mercadorias é R$%.2f\n",valorMedio);
	}
}
