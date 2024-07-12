package aulaOnze.revisaoMatriz;

public class ExemploDois {
	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5,6};
		char[][] matriz = {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},
						{'m','n','o','p'}};

		for(char[] linha : matriz){
			for(char letra : linha){
				System.out.print(letra+" ");
			}
			System.out.println();
		}
	}
}
