import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Numero: ");
		
		String escrit = scan.nextLine();
		int numero = Integer.parseInt(escrit);
		double resultat = 1;
		
		
		while (numero > 0) {
				resultat = resultat * numero;
				numero--;
		}
		System.out.print(resultat);
	}
}
