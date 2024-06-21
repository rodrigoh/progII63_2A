package aula20.exemploAcessoTres;

import java.util.Random;

public class Conta {
	private String titular;
	private String identificador;
	private String senha;
	private float saldo;
	//Criando um atributo estático
	static String nomeBanco;

	Conta(String titular, String senha, float deposito){
		this.titular = titular;
		this.senha = senha;
		saldo = deposito;
		geraIdentificador();
	}

	public String getTitular(){
		return titular;
	}

	public void setSenha(String senha){
		this.senha = senha;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public String getIdentificador(){
		return identificador;
	}

	public void depositar(float valor){

		saldo+=valor;
	}

	private void geraIdentificador(){
		Random aleatorio = new Random();
		String identificador = "";
		for(int i=0;i<4;i++){
			identificador+=(char)aleatorio.nextInt(65,90);
		}
		identificador+=aleatorio.nextInt(1000,2000);
		this.identificador = identificador;
	}

	public boolean sacar(float valor){
		if(saldo>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}

	String saldo(){
		return String.format("Seu saldo é de R$ %.2f",saldo);
	}

	boolean validarAcesso(String identificador, String senha){
		return this.identificador.equals(identificador) && this.senha.equals(senha);
	}
}
