import java.util.Scanner;
public class Primos {
	public static void main(String[] args) {
		int a, b, c;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero e descubra se ele é primo ou não: ");
		a=ler.nextInt();
		b=1;
		c=0;
		while(b<=a) {
			if(a%b==0) {
				c=c+1;
			}
			b=b+1;
			if(c==2) {
				System.out.println(a+" é um numero primo");
			}else {
				System.out.println(a+" não é um numero primo");
			}
		}
		ler.close();
	}
}
