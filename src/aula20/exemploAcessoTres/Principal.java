package aula20.exemploAcessoTres;

public class Principal {
	public static void main(String[] args) {
		Conta c1 = new Conta("Ana","123",10);
		System.out.println("Conta cadastrada com ID: "+c1.getIdentificador());
		Conta c2 = new Conta("José","345",100);
		System.out.println("Conta cadastrada com ID: "+c2.getIdentificador());
		c1.depositar(100);
		c1.sacar(10);
		//Não é possível acessar o atributo saldo diretamente
		//c1.saldo = 0;
		System.out.println(c1.saldo());
	}
}
