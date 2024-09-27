
import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		float p, pn, porc, desc, calc;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o preço total do produto:");
		p = Ler.nextFloat();
		
		System.out.println("Insira o desconto do produto:");
		porc = Ler.nextFloat();
		
		calc = porc/100;
		desc = p*calc;
		pn = p - desc;
		
		System.out.println("O preço do produto com desconto é: " + pn);
		
		Ler.close();
		
	}
}