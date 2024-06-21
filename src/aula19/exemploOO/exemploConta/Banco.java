package aula19.exemploOO.exemploConta;

import java.util.Random;
import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Conta[] contas = new Conta[10];
		Conta c1 = new Conta();
		System.out.print("Qual o nome do titular: ");
		String titular = ler.next();
		System.out.print("Qual o deposito inicial: ");
		float valor = ler.nextFloat();
		System.out.print("Qual a senha: ");
		String senha = ler.next();
		c1.titular = titular;
		c1.identificador = "conta"+new Random().nextInt(1000,100000);
		c1.depositar(valor);
		c1.senha = senha;
		System.out.println("Conta cadastrada obteve o id: "+c1.identificador);
		//Acessando a conta;
		System.out.print("Digite a senha: ");
		senha = ler.next();
		System.out.print("Digite o identificador: ");
		String identificador = ler.next();
		if(c1.validarAcesso(identificador,senha)) {
			char opc;
			do {
				System.out.println("Selecione uma opção");
				System.out.println("v - verificar saldo");
				System.out.println("d - depositar");
				System.out.println("s - sacar");
				System.out.println("e - sair");
				opc = ler.next().toLowerCase().charAt(0);
				switch (opc){
					case 'v'-> System.out.println(c1.saldo());
					case 'd'->{
						System.out.print("Qual valor deseja depositar: ");
						valor = ler.nextFloat();
						c1.depositar(valor);
						System.out.println("Deposito realizado");
					}
					case 's'->{
						System.out.print("Qual valor deseja sacar: ");
						valor = ler.nextFloat();
						if(c1.sacar(valor))
							System.out.println("Saque realizado");
						else
							System.out.println("Saldo insuficiente");
					}
				}
			}
			while(opc!='e');
		}
		else{
			System.out.println("Os dados de acesso estão incorretos");
		}
	}
}
