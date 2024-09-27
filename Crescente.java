import java.util.Scanner;
public class Crescente {

	public static void main(String[] args) {
		int a, b, c;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		a = Ler.nextInt();
		
		System.out.println("Digite o segundo numero:");
		b = Ler.nextInt();
		
		System.out.println("Digite o terceiro numero:");
		c = Ler.nextInt();
		
		if (a <= b && b <= c) {
            System.out.println(a + ", " + b + ", " + c);
        }else if (a <= c && c <= b) {
            System.out.println(a + ", " + c + ", " + b);
        }else if (b <= a && a <= c) {
            System.out.println(b + ", " + a + ", " + c);
        }else if (b <= c && c <= a) {
            System.out.println(b + ", " + c + ", " + a);
        }else if (c <= a && a <= b) {
            System.out.println(c + ", " + a + ", " + b);
        }else {
            System.out.println(c + ", " + b + ", " + a);	
		}
		
		Ler.close();
	}
}