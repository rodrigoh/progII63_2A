package aula19.exemploOO.exemploAluno;

public class Aluno {
	String nome;
	String sobrenome;
	String eMail;
	int codigo;
	float n1;
	float n2;

	public Aluno(String nome, String sobrenome, int codigo){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.codigo = codigo;
		n1 = 0;
		n2 = 0;
	}

	public Aluno(String nome, String sobrenome, int codigo, float n1, float n2){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.codigo = codigo;
		this.n1 = n1;
		this.n2 = n2;
	}

	public Aluno(String nome, int codigo){
		this.nome = nome;
		this.codigo = codigo;
	}

	public Aluno(){

	}

	public void alterarNome(String nome){
		this.nome = nome;
	}

	float calculaMedia(){
		return (n1+n2)/2;
	}

	String obterStatus(){
		float media = calculaMedia();
		if(media>=8)
			return "aprovado";
		else if(media>=6)
			return "recuperação";
		else
			return "reprovado";
	}

}
