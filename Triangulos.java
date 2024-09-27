
import java.util.Scanner;
public class Triangulos {

	public static void main(String[] args) {
		double a, b, c;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado do triangulo:");
		a = Ler.nextDouble();
		
		System.out.println("Digite o valor do segundo lado do triangulo:");
		b = Ler.nextDouble();
		
		System.out.println("Digite o valor do terceiro lado do triangulo:");
		c = Ler.nextDouble();
		
		if (a>b+c || b>a+c || c>b+a ) {
			System.out.println("Não possui caracteristicas de um triangulo.");
		}else if (b==c && a==b) {
			System.out.println("Triangulo equilatero.");
		}else if (a!=b && b!=c && a!=c) {
			System.out.println("Triangulo isosceles.");
		}else {
			System.out.println("Triangulo escaleno.");
		}
		
		Ler.close();
	}
}
