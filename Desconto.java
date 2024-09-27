
import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		float p, pn, d;
		Scanner Ler =  new Scanner(System.in);
		
		System.out.println("Insira o preço do produto:");
		p = Ler.nextFloat();
		
		d = ((p/100)*5);
		
		pn = p - d;
		
		System.out.println("O preço com desconto aplicado é: " + pn);
		
		Ler.close();

	}

}