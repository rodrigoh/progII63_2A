package aulaCinco.exemploRepeticao;

public class ExemploDoWhile2 {
	public static void main(String[] args) {
		int i=10;
		while(i<10){
			System.out.print(i+" ");
			i++;
		}

		do{
			System.out.print(i+" ");
			i++;
		}
		while(i<10);
	}
}
