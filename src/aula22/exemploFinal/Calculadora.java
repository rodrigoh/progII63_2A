package aula22.exemploFinal;

public class Calculadora {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		//Não posso alterar o valor do atributo porque ele é final
		//op.valor = 100;
		System.out.println(Operacoes.PI);
	}
}
