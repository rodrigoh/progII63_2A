package aula23.arquivoTexto;

import java.io.*;

public class EscreverTexto {
	public static void main(String[] args) {
		try{
			BufferedWriter arquivoTexto =
							new BufferedWriter(new FileWriter("./texto.txt"));
			for(int i=0;i<10;i++){
				arquivoTexto.append("Linha "+i+" do arquivo\n");
			}
			arquivoTexto.close();
		}
		catch (FileNotFoundException e){
			System.out.println("Erro ao escrever o arquivo");
		}
		catch (IOException e){
			System.out.println("Erro ao criar arquivo");
		}
	}
}
