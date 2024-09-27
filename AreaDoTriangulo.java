
import java.util.Scanner;
public class AreaDoTriangulo {

	public static void main(String[] args) {
		double r, b, h;
		Scanner Ler= new Scanner(System.in);
		
		System.out.println("Insira o valor da base do triângulo: ");
		b = Ler.nextDouble();
		
		System.out.println("Insira o valor da Altura do triângulo:");
		h = Ler.nextDouble();
		
		r = ((b*h)/2);
		
		System.out.println("O valor da area do triângulo é: " + r);
		Ler.close();
	}
	
	
}