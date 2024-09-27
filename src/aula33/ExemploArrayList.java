package aula33;

import java.util.List;
import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		//Adicionar um elemento na lista
		lista.add("A");
		lista.add("B");
		lista.add("J");
		lista.add("C");
		lista.add("Z");
		lista.add("T");
		//Adicionando um elemento em qualquer posição da lista
		lista.add(3,"D");
		System.out.println(lista);
		lista.sort(null);
		System.out.println(lista);
		System.out.println("A lista contém um 'T'? "+lista.contains("T"));
		System.out.println("Onde está o 'T' na lista? "+lista.indexOf("T"));
		System.out.println("Onde está a última ocorrência de 'T' na lista "+
						lista.lastIndexOf("T"));
		System.out.println("Adicionando mais um T na lista...");
		lista.add("T");
		System.out.println("Onde está a última ocorrência de 'T' na lista "+
						lista.lastIndexOf("T"));
		System.out.println(lista);
		System.out.println("Removendo o elemento da posição 2 "+lista.remove(2));
		System.out.println("Removendo o elemento 'D' da lista: "+lista.remove("D"));
		System.out.println(lista);
		System.out.println("A lista está vazia? "+lista.isEmpty());
		lista.clear();
		System.out.println("A lista está vazia? "+lista.isEmpty());
	}
}
