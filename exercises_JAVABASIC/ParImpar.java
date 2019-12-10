package ExerciseToPractice;

import java.util.Scanner;

public class ParImpar {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("Ingresa el numero a evaluar: ");
		int numero = scan.nextInt();

		if (numero % 2 == 0)
			System.out.println(numero + " es un numero par");
		else
			System.out.println(numero + " es un numero impar");
	}
}
