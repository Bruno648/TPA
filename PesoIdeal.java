import java.util.Scanner;

public class PesoIdeal {
	
	public static void main(String[] args) {
		double alt, pesoI;
		String resp ;
		Scanner Ler = new Scanner(System.in);
		do {
			System.out.println("Digite seu sexo, usando m para masculino e f para feminino:");
			resp = Ler.next();
			System.out.println("Digite a sua altura (em centímetros):");
			alt = Ler.nextDouble();
			if (resp.equalsIgnoreCase("m")) {
				pesoI = 52 + (0.75 *(alt-152.4));
			System.out.println("O seu peso ideal é:" +pesoI);
			}else if (resp.equalsIgnoreCase("f")) {
				pesoI = 52 + (0.67 *(alt-152.4));
			System.out.println("O seu peso ideal é:" +pesoI);
			}
			System.out.println("Deseja continuar? 1 e 2 para não.");
			resp = Ler.next();
			}while (resp.equals("1"));

		}
	}
 