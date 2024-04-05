package aulaSeis.exemplosVetores;

public class Exemplo2 {
	public static void main(String[] args) {
		int[] lista = {1,2,5,7,9,10};
		String[] nomes = {"Ana", "Pedro", "João"};
		System.out.println("Imprimir o vetor de números: ");
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+" ");
		}
		System.out.println("\nLista de nomes: ");
		for(int i=0;i< nomes.length;i++){
			System.out.print(nomes[i]+" ");
		}
		System.out.println("\nImprimir o vetor de números com for simplificado: ");
		for(int num : lista){
			System.out.print(num+" ");
		}
		System.out.println("\nLista de nomes for simplificado: ");
		for(String nome : nomes){
			System.out.print(nome+" ");
		}

	}
}
