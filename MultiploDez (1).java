import java.util.Scanner;
public class MultiploDez {
	
public static void main(String[] args) {
	
	Scanner Ler = new Scanner(System.in);
	
	int i=1;
	
	
	for (i=1;i<=100;i++)
	   if (i % 10 == 0){
		   System.out.println(i + " Este valor, é um múltiplo de 10.");
		   
	   }else {
		   System.out.println(i);
	   }
	
	System.out.println("Os valores múltiplos de 10 são: 10, 20, 30, 40, 50, 60, 70, 80, 90 e 100.");
	
		
	
		
}
}