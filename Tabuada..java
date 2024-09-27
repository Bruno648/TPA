import java.util.Scanner;
public class Tabuada {
 
		public static void main(String[] args) {
			int numero,r, i, c;
			Scanner Ler= new Scanner(System.in);
			
			System.out.println("Digite o numero que quer saber a tabuada:");
			numero= Ler.nextInt();
			
			System.out.println("Digite até qual numero deseja calcular a tabuada");
			c= Ler.nextInt();
			
			i= 1;
			
			System.out.println("A tabuada até o" + c + ", do numero" + numero + ", é:" );
			
			while (i <= c) {
				r = numero*i;
				System.out.println(numero +"x"+ i+"= "+ r);
				i=i+1;
			}
			
			Ler.close();
		}
}