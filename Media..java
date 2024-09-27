
import java.util.Scanner;
public class Media {
	
	public static void main(String[] args) {
		float  n1, n2, n3, m;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = Ler.nextFloat();
		
		System.out.println("Digite a segunda nota nota: ");
		n2 = Ler.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = Ler.nextFloat();
		
		m = ((n1 + n2 + n3)/3);
		
		System.out.println("A média das notas aprenetadas é: " + m);
		
		Ler.close();
		
		
	}
}