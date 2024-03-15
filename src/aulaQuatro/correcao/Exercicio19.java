package aulaQuatro.correcao;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Selecione uma figura para calcular a área:");
		System.out.println("t -> para triângulo");
		System.out.println("q -> para quadrado");
		System.out.println("c -> círculo");
		System.out.println("r -> retângulo");
		//String opc = ler.next().toLowerCase();
		char opc = ler.next().charAt(0);
		switch (opc){
			case 't'->{
				System.out.print("Qual o valor da base: ");
				float base = ler.nextFloat();
				System.out.print("Qual o valor da altura: ");
				float altura = ler.nextFloat();
				float area = base*altura/2;
				System.out.printf("A área vale %.3f cm²\n");
			}
			case 'q'->{
				System.out.print("Qual o valor do lado: ");
				float lado = ler.nextFloat();
				float area = lado*lado;
				System.out.printf("A área vale %.3f cm²\n");
			}
			case 'c'->{
				System.out.print("Qual o valor do raio: ");
				float raio = ler.nextFloat();
				float area = (float)Math.PI*raio*raio;
				System.out.printf("A área vale %.3f cm²\n");
			}
			case 'r'->{
				System.out.print("Qual o valor da base: ");
				float base = ler.nextFloat();
				System.out.print("Qual o valor da altura: ");
				float altura = ler.nextFloat();
				float area = base*altura;
				System.out.printf("A área vale %.3f cm²\n");
			}
			default -> System.out.println("Opção inválida");
		}
	}
}
