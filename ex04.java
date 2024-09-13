package projeto;
import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		int id, anoNasc, anoA, u= 1, i= 1;
		Scanner Ler= new Scanner(System.in);
		System.out.println("Digite o ano atual:");
		anoA= Ler.nextInt();
		while (i<=6) {
		System.out.println("Usuário" + u);
		System.out.println("Digite o ano de seu nascimento: ");
		anoNasc= Ler.nextInt();
		id = anoA - anoNasc;
		if (id < 18) {
			System.out.println("É menor de idade, " + id +" anos.");
		}else {
			System.out.println("É maior de idade, " + id +" anos.");
		}
		u+=1;
		i+=1;
		}
	}
}
