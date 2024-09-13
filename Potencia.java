import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
		int expoente, contador;
		double base, potencia;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva a base que deseja calcular: ");
		base=ler.nextDouble();
		System.out.println("Escreva o expoente que deseja calcular: ");
		expoente=ler.nextInt();
		potencia = 1;
		contador = 0;
		while(contador<expoente) {
			potencia=potencia*base;
			contador++;
		}System.out.println("A base "+base+" ao expoente "+expoente+" resulta na potencia "+potencia);

	}

}
