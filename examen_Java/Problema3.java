import java.util.Scanner;

public class Problema3 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Ingresa la palabra o frase a analizar: ");
		String cadenaProbar = scan.nextLine();
		
		int i = 0;
		int iAlrevez = cadenaProbar.length() - 1;
		boolean esPalindromo = false;
		
		if (cadenaProbar.length() < 50) {		
		

		while ((i < iAlrevez) && (!esPalindromo)) {

			if (cadenaProbar.charAt(i) == cadenaProbar.charAt(iAlrevez)) {
				i++;
				iAlrevez--;
			} else {
				esPalindromo = true;
			}
		}

		if (!esPalindromo)
			System.out.println(cadenaProbar + " es un PALINDROMO");
		else
			System.out.println(cadenaProbar + " NO es un palindromo");

		} else {
			System.out.println("Tu palabra o cadena supera los 50 caracteres");
		}
	}
}
