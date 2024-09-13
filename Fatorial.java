import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		int b, c;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva o numero que deseja fatorar: ");
		b=ler.nextInt();
		c=1;
		while(b>1) {
			c=c*b;
			b=b-1;
			System.out.println(c);
		}
	}
}
