package aula19.exemploOO.exemploAluno;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Criando um novo aluno
		//Aluno a1 = new Aluno();
		//
		System.out.print("Qual o nome: ");
		String nome = ler.next();
		System.out.print("Qual o sobrenome: ");
		String sobrenome = ler.next();
		System.out.print("Qual o e-mail: ");
		String mail = ler.next();
		int codigo = new Random().nextInt(1000,10000);
		System.out.print("Qual a primeira nota: ");
		float n1 = ler.nextFloat();
		System.out.print("Qual a segunda nota: ");
		float n2 = ler.nextFloat();
		//Criando uma instância com os valores no construtor
		Aluno a1 = new Aluno(nome,sobrenome,codigo);
		//Inserindo as informações no aluno
//		a1.nome = nome;
//		a1.sobrenome = sobrenome;
		a1.eMail = mail;
		a1.n1 = n1;
		a1.n2 = n2;

		System.out.println("O aluno "+a1.nome+" "+a1.sobrenome+" tem média  "+a1.calculaMedia()+" e está "+a1.obterStatus());

		Aluno a2 = new Aluno("Ana","Silva",123);
		Aluno a3 = new Aluno("Pedro",124);
		Aluno a4 = new Aluno();


	}
}
