import java.util.Scanner;
public class Futebol {

		public static void main(String[] args) {
			int id;
			Scanner Ler= new Scanner(System.in);
			System.out.println("Digite a idade do aluno");
			id= Ler.nextInt();
			switch (id) {
		
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Esse aluno é: Dente de leite");
			break;
		
			case 7:
				System.out.println("Esse aluno é: Júnior");
			break;
		
			case 8:
				System.out.println("Esse aluno é: Júnior Max");
			break;
		
			case 9:
				System.out.println("Esse aluno é: Júnior Master");
			break;
		
			case 10:
				System.out.println("Esse aluno é: Master");
			break;
		
			default:
				System.out.println("A escola não admite alunos de outras idades");
			}
			Ler.close();
		}
}