package aulaTres.correcao;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe: ");
		System.out.print("Km no início do dia: ");
		int kmInicial = ler.nextInt();
		System.out.print("Km no final do dia: ");
		int kmFinal = ler.nextInt();
		System.out.print("Litros de combustível utilizados: ");
		float litros = ler.nextFloat();
		System.out.print("Valor recebido R$ ");
		float valorTotal = ler.nextFloat();
		float autonomia = (kmFinal - kmInicial) / litros;
		float lucro = valorTotal - litros * (float) 4.15;
		System.out.printf("R$ %.2f",lucro);
		//Exemplos de String.format()
		String valorFormatado = String.format("R$ %.2f",lucro);
		System.out.println("Seu lucro foi de "+valorFormatado);
		System.out.println("Seu lucro foi de "+String.format("R$ %.2f", lucro));
		System.out.println(String.format("Seu lucro foi de R$ %.2f",lucro));
		System.out.println("A autonomia do carro foi de "+String.format("%.3f km/l", autonomia));


	}
}
