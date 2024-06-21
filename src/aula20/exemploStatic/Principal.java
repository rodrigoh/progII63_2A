package aula20.exemploStatic;

public class Principal {
	public static void main(String[] args) {
		Conta c1 = new Conta("Ana","123",10);
		System.out.println("Conta cadastrada com ID: "+c1.identificador);
		Conta c2 = new Conta("José","345",100);
		System.out.println("Conta cadastrada com ID: "+c2.identificador);
		//Testando o atributo estático
		c1.nomeBanco = "Banco CIMOL";
		System.out.println("Nome do banco c1 "+c1.nomeBanco);
		System.out.println("Nome do banco c2 "+c2.nomeBanco);
		//Acesso diretamente pela Classe, já que é um atributo estático
		Conta.nomeBanco = "Teste";
		System.out.println("Nome do banco c1 "+c1.nomeBanco);
		System.out.println("Nome do banco c2 "+c2.nomeBanco);

	}
}
