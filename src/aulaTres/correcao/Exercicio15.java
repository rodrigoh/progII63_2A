package aulaTres.correcao;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.println("Sobre o GP informe: ");
		System.out.print("Comprimento da pista em metros: ");
		float comprimentoPista = ler.nextFloat()/1000;
		System.out.print("Número de voltas: ");
		int voltas = ler.nextInt();
		System.out.print("Número de abastecimentos: ");
		int abastecimentos = ler.nextInt();
		System.out.print("Autonomia em km/l: ");
		float autonomia = ler.nextFloat();
		float distancia = comprimentoPista*voltas;
		float litrosTotal = distancia/autonomia;
		float litrosPabastece = litrosTotal/abastecimentos;
		System.out.println("Serão necessários "+
						String.format("%.2f litros", litrosPabastece)+" a cada abastecimento");

	}
}
