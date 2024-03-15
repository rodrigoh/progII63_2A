package aulaQuatro.correcao;

import java.util.Scanner;

/*
Escreva um algoritmo que leia 4 valores i, a, b, c escrever os
valores lidos e em seguida
Se i = 1 escrever os três valores em ordem crescente
Se i = 2 escrever os três valores em ordem decrescente
Se i = 3 Escrever o dobro dos três números

 */
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um valor para i deve ser 1, 2 ou 3: ");
		int i = ler.nextInt();
		System.out.print("Informe a: ");
		int a = ler.nextInt();
		System.out.print("Informe b: ");
		int b = ler.nextInt();
		System.out.print("Informe c: ");
		int c = ler.nextInt();
		switch (i){
			case 1->{
				System.out.print("Os valores de a, b e c em ordem crescente são ");
				/* a b c, a c b, b a c, b c a, c a b, c b a */
				if(a<b && b<c)
					System.out.println(a+", "+b+", "+c);
				else if(a<c && c<b)
					System.out.println(a+", "+c+", "+b);
				else if(b<a && a<c)
					System.out.println(b+", "+a+", "+c);
				else if(b<c && c<a)
					System.out.println(b+", "+c+", "+a);
				else if(c<a && a<b)
					System.out.println(c+", "+a+", "+b);
				else if(c<b && c<a)
					System.out.println(c+", "+b+", "+a);
			}
			case 2->{
				System.out.print("Os valores de a, b e c em ordem decrescente são ");
				if(a>b && b>c)
					System.out.println(a+", "+b+", "+c);
				else if(a>c && c>b)
					System.out.println(a+", "+c+", "+b);
				else if(b>a && a>c)
					System.out.println(b+", "+a+", "+c);
				else if(b>c && c>a)
					System.out.println(b+", "+c+", "+a);
				else if(c>a && a>b)
					System.out.println(c+", "+a+", "+b);
				else if(c>b && c>a)
					System.out.println(c+", "+b+", "+a);
			}
			case 3->{
				System.out.println(a+" x 2 = "+a*2);
				System.out.println(b+" x 2 = "+b*2);
				System.out.println(c+" x 2 = "+c*2);
			}
			default -> System.out.println("O valor de 'i' é inválido");
		}
	}
}
