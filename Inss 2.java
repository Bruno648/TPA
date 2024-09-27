import java.util.Scanner;
public class Inss {

	public static void main(String[] args) {
	
		Scanner Ler= new Scanner(System.in);
		Double renda, aliquota;
		System.out.println("Informe a sua renda:");
		
		renda= Ler.nextDouble();
		
		if (renda<= 1420.00) {
		aliquota =(renda*0.075);
		System.out.println("O valor a ser recolhido é:" + aliquota);
		} else if (renda<= 2666.68 ) {
		aliquota= (renda*0.09);
		System.out.println("O valor a ser recolhido é:" + aliquota);
		} else if (renda<= 4000.03) {
		aliquota= (renda*0.12);
		System.out.println("O valor a ser recolhido é:" + aliquota);
		} else if (renda<= 7786.02) {
		aliquota= (renda*0.14);
		System.out.println("O valor a ser recolhido é:" + aliquota);
		} else {
		aliquota= (renda*0.16);
		}
		
		Ler.close();
		
		System.out.println("O valor a ser recolhido é:" + aliquota);
	}
}