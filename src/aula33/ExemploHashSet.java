package aula33;

import java.util.HashSet;

public class ExemploHashSet {
	public static void main(String[] args) {
		HashSet<String> compras = new HashSet<>();
		System.out.println("Adicionando arroz a lista "+compras.add("Arroz"));
		System.out.println("Adicionando pastel a lista "+compras.add("Pastel"));
		System.out.println("Adicionando queijo a lista "+compras.add("queijo"));
		System.out.println("Adicionando chocolate "+compras.add("chocolate"));
		System.out.println(compras);
		System.out.println("Adicionando pastel a lista "+compras.add("Pastel"));

	}
}
