
import java.util.Scanner;
public class Zod {
	public static void main(String[] args) {		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite o dia do seu nascimento (1-31): ");
		        int dia = scanner.nextInt();
		        System.out.print("Digite o mes do seu nascimento (1-12): ");
		        int mes = scanner.nextInt();
		        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
		            System.out.println("Data invalida.");
		        } else {
		            String signo;
		            switch (mes) {
		                case 1: // Janeiro
		                    signo = (dia >= 1 && dia <= 19) ? "Capricornio" : "Aquario";
		                    break;
		                case 2: // Fevereiro
		                    signo = (dia >= 1 && dia <= 18) ? "Aquario" : "Peixes";
		                    break;
		                case 3: // MarÃ§o
		                    signo = (dia >= 1 && dia <= 20) ? "Peixes" : "Aries";
		                    break;
		                case 4: // Abril
		                    signo = (dia >= 1 && dia <= 19) ? "Aries" : "Touro";
		                    break;
		                case 5: // Maio
		                    signo = (dia >= 1 && dia <= 20) ? "Touro" : "Gemeos";
		                    break;
		                case 6: // Junho
		                    signo = (dia >= 1 && dia <= 20) ? "Gemeos" : "Cancer";
		                    break;
		                case 7: // Julho
		                    signo = (dia >= 1 && dia <= 22) ? "Cancer" : "Leão";
		                    break;
		                case 8: // Agosto
		                    signo = (dia >= 1 && dia <= 22) ? "Leão" : "Virgem";
		                    break;
		                case 9: // Setembro
		                    signo = (dia >= 1 && dia <= 22) ? "Virgem" : "Libra";
		                    break;
		                case 10: // Outubro
		                    signo = (dia >= 1 && dia <= 22) ? "Libra" : "Escorpião";
		                    break;
		                case 11: // Novembro
		                    signo = (dia >= 1 && dia <= 21) ? "Escorpião" : "Sagitario";
		                    break;
		                case 12: // Dezembro
		                    signo = (dia >= 1 && dia <= 21) ? "Sagitario" : "Capricornio";
		                    break;
		                default:
		                    signo = "Data invalida";
		                    break;
		            }
		            System.out.println("Seu signo do zodiaaco é: " + signo);
		        }

		        scanner.close();
		    }
		

}
