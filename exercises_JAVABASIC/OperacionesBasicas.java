package ExerciseToPractice;

import java.util.Scanner;

public class OperacionesBasicas {

	public static int suma(int numA, int numB) {
		return numA + numB;
	}

	public static int resta(int numA, int numB) {
		return numA - numB;

	}

	public static int multiplicacion(int numA, int numB) {
		return numA * numB;

	}

	public static int division(int numA, int numB) {
		return numA / numB;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numA, numB;
		System.out.print("Ingresa el primer valor: "); numA = scan.nextInt();
		System.out.print("Ingresa el segundo valor: "); numB = scan.nextInt();
		System.out.println("");
		
		System.out.println("Operaciones con "+numA+" y "+numB+" ");
		System.out.println("Suma = "+suma(numA, numB));
		System.out.println("Resta = "+resta(numA, numB));
		System.out.println("Multiplicacion = "+multiplicacion(numA, numB));
		System.out.println("Division = "+division(numA, numB));

	}
}
