
import java.util.Scanner;
public class Dividas {

	public static void main(String[] args) {
		float sal, div, saldo;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o valor do seu salario:");
		sal = Ler.nextFloat();
		
		System.out.println("Insira o valor de suas dividas:");
		div = Ler.nextFloat();
		
		saldo = sal - div;
		
		if (saldo >= 0) {
			System.out.println("Não possui dividas, seu saldo após o calculo é: " + saldo);
		}else {
			System.out.println("Possui divida, sua divida após o calculo é: " + saldo);
		}
		
		Ler.close();
	}
}
