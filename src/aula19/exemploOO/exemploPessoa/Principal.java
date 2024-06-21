package aula19.exemploOO.exemploPessoa;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o nome: ");
		p1.nome = ler.next();
		System.out.print("Qual o sobrenome do "+p1.nome+": ");
		p1.sobrenome = ler.next();
		System.out.print("Qual a altura do "+p1.nome+": ");
		p1.altura = ler.nextInt();
		p1.andar();
		p1.correr();
		p1.parar();
		//Acessando os atributos para mostrar na tela
		System.out.println("Nome: "+p1.nome+" "+p1.sobrenome);
		//Usando o método obterDados para mostrar na tela
		String dados = p1.obterDados();
		System.out.println(dados);
	}
}
