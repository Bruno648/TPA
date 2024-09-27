import java.util.Scanner;
public class TrocadeVariaveis {
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o valor a:");
		a = Ler.nextInt();
		
		System.out.println("Insir o valor b:");
		b = Ler.nextInt();
		
		System.out.println(a + ", " + b );
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a + ", " + b );
		
		Ler.close();
		
		
	}
}