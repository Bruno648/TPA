
import java.util.Scanner;
public class Aumento {
	
	public static void main(String[] args) {
		double s, a, sn;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o salario atual: ");
		s = Ler.nextDouble();
		
		a = s*0.12;
		
		sn = s + a;
		
		System.out.println("O salário novo é: " + sn);
		
		Ler.close();
	
	}
}