package aula31.exemploAbstrato;

public class Main {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.setRaio(5);
		System.out.println("A área da figura "+
						c1.getNomeFigura()+" vale "+c1.calculaArea());
		System.out.println("O perímetro da figura "+
						c1.getNomeFigura()+" vale "+c1.calculaPerimetro());

		Retangulo r1 = new Retangulo();
		r1.setBase(8);
		r1.setAltura(4);
		System.out.println("A área da figura "+r1.getNomeFigura()+
						"vale "+r1.calculaArea());
		System.out.println("O perímetro da figura "+r1.getNomeFigura()+
						"vale "+r1.calculaPerimetro());
	}
}
