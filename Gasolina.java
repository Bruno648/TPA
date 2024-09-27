
import java.util.Scanner;
public class Gasolina {
	
	public static void main(String[] args) {
		double km, c, r;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite a distancia percorrida em quilomêtros:");
		km = Ler.nextDouble();
		System.out.println("Digite o total de combustivel gasto durante o percurso");
		c = Ler.nextDouble();
		
		r = km/c;
		
		if (r >= 10) {
			System.out.println("Econômico");
		
		}else {
			System.out.println("Não econômico");
		}
		
		Ler.close();
	}

}
