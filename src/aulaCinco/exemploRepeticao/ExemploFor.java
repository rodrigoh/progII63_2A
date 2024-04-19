package aulaCinco.exemploRepeticao;

public class ExemploFor {
	public static void main(String[] args) {
		//for(inicialização; teste; passo)
		for(int i=0;i<=10;i++){
			System.out.print(i+" ");
		}
		System.out.println("\nExemplo dois");
		int i;
		for(i=0;i<20;i+=2){
			System.out.print(i+" ");
		}

		System.out.println("\nExemplo três");
		for(int j=0, l=9;j<10 && l>=0; j++, l--){
			System.out.println("j = "+j+", l = "+l);
		}
		System.out.println("\nExemplo quatro");
		int t = 10;
		for(;t<=20;t++){
			System.out.print(t+" ");
		}
		System.out.println("\nExemplo cinco");
		t = 0;
		//for(; teste;)
		for(;t<10;){
			System.out.print(t+" ");
			t++;
		}

	}
}
