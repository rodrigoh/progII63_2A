package aula32;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();

		lista.add("A");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		lista.add("C");
		lista.add("F");
		lista.add(1,"B");
		System.out.println("A lista tem um 'A' "+lista.contains("A"));
		System.out.println("A lista tem um 'W' "+lista.contains("W"));
		System.out.println(lista);
		System.out.println("O tamanho da lista é "+lista.size());
		System.out.println("A posição de 'C' na lista é "+lista.indexOf("C"));
		System.out.println("A posição de 'C' na lista é "+lista.lastIndexOf("C"));
		System.out.println("O elemento da posição 4 é "+lista.get(4));
		lista.clear();
		System.out.println("A lista está vazia: "+lista.isEmpty());
		System.out.println(lista);
	}
}
