package aula33;

import java.util.HashMap;

public class ExemploHashMap {
	public static void main(String[] args) {
		HashMap<String, String> capitais = new HashMap<>();
		capitais.put("RS","Porto Alegre");
		capitais.put("PR","Curitiba");
		capitais.put("SC","Florianópolis");
		capitais.put("RJ","Rio de Janeiro");
		capitais.put("SP","São Paulo");
		System.out.println(capitais);
		capitais.put("RS","Rio Grande");
		System.out.println(capitais);

		System.out.println("Lista de estados");
		for(String estado:capitais.keySet())
			System.out.print(estado+" ");

		System.out.println("Lista de cidades");
		for(String cidade:capitais.values())
			System.out.print(cidade+" ");

		System.out.println("\nApagando a chave 'RJ' da lista "+capitais.remove(
						"RJ"));
		System.out.println("A lista tem uma chave 'RS' "+
						capitais.containsKey("RS"));
		System.out.println("A lista tem uma cidade 'Porto Alegre' "+
						capitais.containsValue("Porto Alegre"));

	}
}
