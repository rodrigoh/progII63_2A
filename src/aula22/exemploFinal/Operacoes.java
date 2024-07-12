package aula22.exemploFinal;


public class Operacoes {
	//Atributos com o modificador final precisam ser inicializados, caso não
	// seja a inicialização deve ocorrer até o final do construtor
	final double valor;

	//Para criar uma constante ela dever ser estática e final ao mesmo tempo
	//Acesso global -> public
	//Disponível diretamente na classe -> static
	//Inalterável -> final
	public static final double PI = 3.141592653589793;

	public Operacoes(){
		valor = 10;
	}
}
