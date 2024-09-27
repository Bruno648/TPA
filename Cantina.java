import java.util.Scanner;
public class Cantina {

		public static void main(String[] args) {
			int cod;
			Scanner Ler= new Scanner(System.in);
			System.out.println("Digite o código do item desejado:");
			cod= Ler.nextInt();
			switch (cod) {
			
			case 1:
				System.out.println("Cachorro quente, valor: 08,00");
			break;
			
			case 2:
				System.out.println("Cheeseburger, valor: 12,00");
			break;
			
			case 3:
				System.out.println("X-Salada, valor: 15,00");
			break;
			
			case 4:
				System.out.println("Misto Quente, valor: 11,00");
			break;
			
			case 5:
				System.out.println("Pão na chapa, valor: 06,00");
			break;
			
			default:
				System.out.println("Código invalido.");
			}
			Ler.close();
		}
}
