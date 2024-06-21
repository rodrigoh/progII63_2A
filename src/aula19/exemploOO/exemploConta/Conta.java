package aula19.exemploOO.exemploConta;

public class Conta {
	String titular;
	String identificador;
	String senha;
	float saldo;

	void depositar(float valor){
		saldo+=valor;
	}

	boolean sacar(float valor){
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
