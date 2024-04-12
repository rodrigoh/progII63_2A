package aulaSete.correcao;

import java.util.Scanner;

public class Exercicio6Nomes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] nomes = {"Ana", "Bruno", "Camila", "Daniel", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Julia"};

		System.out.print("Qual nome devo procurar na lista: ");
		String busca = ler.next();
		boolean achei = false;
		for(int i=0;i<nomes.length;i++){
			if(nomes[i].equalsIgnoreCase(busca))
				achei=true;
		}
		if(achei){
			System.out.println("A pessoa "+busca+" está na lista");
		}
		else{
			System.out.println("A pessoa "+busca+" não está na lista");
		}
	}
}
