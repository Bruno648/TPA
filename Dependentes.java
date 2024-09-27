
import java.util.Scanner;
public class Dependentes {

	public static void main(String[] args) {
		int sal, sn, benef, dep;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		sal = Ler.nextInt();
		
		System.out.println("Digite o numero de dependentes:");
		dep = Ler.nextInt();
		
		
		benef = dep*55;
		sn = sal + benef;
		
		System.out.println("O seu salario, mais a soma de beneficios relacionada aos dependentes é: " + sn );
		
		Ler.close();
		
	}

}