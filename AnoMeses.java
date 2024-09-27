
import java.util.Scanner;
public class AnoMeses {
	
	public static void main(String[] args) {
		float dias, anos, meses;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o numero de dias:");
		dias = Ler.nextFloat();
		
		anos = dias/365;
		meses = dias/30;
		
		System.out.println("O numero de dias convertido em anos é: " + anos);
		System.out.println("O numero de dias convertido em meses é: " + meses);
		
		Ler.close();
		
	}
}
