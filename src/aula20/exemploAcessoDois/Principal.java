package aula20.exemploAcessoDois;

import aula20.exemploAcesso.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		//O acesso ao atributo nome não é permitido a nível mundo
		//p1.nome = "Ana";
		p1.sobrenome = "Silva";
	}
}
