public class Altura {

	public static void main(String[] args) {
		double altJ = 134.0, altP = 145.0;
		
		int i = 0;
		
		while (altJ <= altP) {
			
			altJ += 2.5;
			altP += 2.0;
		
			i++;
		}
		System.out.println("João ira ultrapassar Pedro na altura em " + i + " anos");
		System.out.println("Altura final de João: " + altJ);
		System.out.println("Altura final de pedro: " + altP);
	}

}