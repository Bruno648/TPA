
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		int anoA, anoN, id;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o ano atual:");
		anoA = Ler.nextInt();
		
		System.out.println("Insira o seu ano de nascimento:");
		anoN = Ler.nextInt();
		
        id = anoA - anoN;
        
        System.out.println("A sua idade é: " + id);
        
        Ler.close();
        
	}
}