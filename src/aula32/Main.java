package aula32;

public class Main {
	public static void main(String[] args) {
		Lista<String> l1 = new Lista<>(10);
		l1.adiciona("A");
		l1.adiciona("C");
		l1.adiciona("D");
		l1.adiciona("E");
		System.out.println(l1);
		l1.adiciona(1,"B");
		System.out.println(l1);
		System.out.println("Elemento da posição 2 "+l1.obter(2));
		try {
			System.out.println("Elemento da posição -1 " + l1.obter(-1));
		}
		catch (IllegalArgumentException e){
			System.out.println(e);
		}
		System.out.println("Posição do elemento 'C' é "+l1.posicaoDe("C"));
		System.out.println("Posição do elemento 'c' é "+l1.posicaoDe("c"));
		l1.adiciona("F");
		l1.adiciona("G");
		l1.adiciona("C");
		l1.adiciona("H");
		l1.adiciona("I");
		l1.adiciona("J");
		System.out.println(l1);
		System.out.println("Removendo o elemento 4 da lista "+l1.remove(4));
		System.out.println(l1);

	}
}
