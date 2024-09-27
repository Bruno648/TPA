
import java.util.Scanner;
public class Eleicao {

	public static void main(String[] args) {
		int id, an, ae;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento:");
		an = Ler.nextInt();
		
		System.out.println("Digite o ano da eleição:");
		ae = Ler.nextInt();
		
		id = ae - an;
		
		if (id < 16) {
			System.out.println("Você terá " + id + " anos, e não poderá votar.");
		}else {
			System.out.println("Você terá " + id + " anos, e poderá votar.");
		}
		
		Ler.close();
	}
}