
import java.util.Scanner;
public class Dent {
public static void main(String[] args) {
	Scanner In = new Scanner(System.in);
	int d;
	System.out.println("Insira a idade do aluno:");
	d = In.nextInt();
	switch (d) {
	case 6:
		System.out.println("Dente de leite");
		break;
	case 7:
		System.out.println("Junior");
		break;
	case 8:
		System.out.println("Junior Max");
		break;
	case 9:
		System.out.println("Junior Master");
		break;
	case 10:
		System.out.println("Master");
		break;
		default:
		System.out.println("Idade invalida");
	}
	In.close();
}	
}
