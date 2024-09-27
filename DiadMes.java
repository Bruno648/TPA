import java.util.Scanner;
public class DiadMes {
	 
	public static void main(String[] args) {
		int mes;
		Scanner Ler =new Scanner(System.in);
		System.out.println("Digite o mês (Em números) de sua preferência: ");
		mes=Ler.nextInt();
		switch (mes) {
		
		case 1: 
			System.out.println("O mês 1 (Janeiro) possui um total de 31 dias");
		break;
		
		case 2:
			System.out.println("O mês 2 (Fevereiro) possui um total de 28 dias");
		break;
		
		case 3:
			System.out.println("O mês 3 (Março) possui um total de 31 dias");
		break;
		
		case 4:
			System.out.println ("O mês 4 (Abril) possui um total de 30 dias");
		break;
		
		case 5: 
			System.out.println("O mês 5 (Maio) possui um total de 31 dias");
		break;
		
		case 6:
			System.out.println("O mês 6 (Junho) possui um total de 30 dias");
		break;
		
		case 7: 
			System.out.println("O mês 7 (Julho) possui um total de 31 dias");
		break;
		
		case 8:
			System.out.println("O mês 8 (Agosto) possui um total de 31 dias");
		break;
		
		case 9:
			System.out.println("O mês 9 (Setembro) possui um total de 30 dias");
		break;
		
		case 10:
			System.out.println ("O mês 10 (Outubro) possui um total de 31 dias");
		break;
		
		case 11: 
			System.out.println("O mês 11 (Novembro) possui um total de 30 dias");
		break;
		
		case 12:
			System.out.println("O mês 12 (Dezembro) possui um total de 31 dias");
		break;
		
		default:
			System.out.println("Este mês não existe.");
		}
		
		Ler.close();
	}

}
