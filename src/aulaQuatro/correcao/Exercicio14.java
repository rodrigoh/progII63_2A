package aulaQuatro.correcao;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantas horas foram trabalhadas: ");
		float horas = ler.nextFloat();
		System.out.print("Qual o valor da hora: ");
		float valorHora = ler.nextFloat();
		float salarioBase = 160*valorHora;
		if(horas>160){
			float salarioExtra = (horas-160)*(valorHora*(float)1.5);
			System.out.println("Seu salário base é de "+String.format("R$ %.2f", salarioBase));
			System.out.println("Seu salário extra é de "+String.format("R$%.2f", salarioExtra));
			System.out.println("Totalizando "+String.format("R$ %.2f",salarioBase+salarioExtra));
		}
		else{
			System.out.println("Seu salário base é de "+String.format("R$ %.2f", salarioBase));
		}
	}
}
