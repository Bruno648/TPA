import java.util.Scanner;
public class Futebol {

		public static void main(String[] args) {
		
			Scanner Ler= new Scanner(System.in);
			int id;
			System.out.println("Insira a idade do aluno:");
			id= Ler.nextInt();
			
			switch (id) {
			
			case 6:
				System.out.println("Alunos de 6 anos são categoria “dente de leite”");
			break;

			case 7:
				System.out.println("Alunos de 7 anos são categoria “júnior”");
			break;
			
			case 8:
				System.out.println("Alunos de 8 anos são categoria “júnior max” ");
			break;
			
			case 9:
				System.out.println("Alunos de 9 anos são categoria “júnior master”");
			break;
			
			case 10:
				System.out.println("Alunos de 10 anos são categoria “master” ");
			break;
			
			default:
				System.out.println("A escola não admite alunos de outras idades.");
		}
		Ler.close();
	}
}