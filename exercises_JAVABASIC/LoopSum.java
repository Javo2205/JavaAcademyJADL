package ExerciseToPractice;

import java.util.Scanner;

public class LoopSum {
	
	static Scanner scan = new Scanner(System.in);
	
	public static int suma(int numA, int numB) {
		return numA + numB;
	}
	
	public static void main(String[] args) {
		int opcion = 0;
		
		do {
			System.out.print("Ingresa el primer valor: "); int numA = scan.nextInt();
			System.out.print("Ingresa el segundo valor: "); int numB = scan.nextInt();
			System.out.println("");
			System.out.println(numA + " + " + numB + " = " + suma(numA, numB));
			
			System.out.println("¿Volver a evaluar? \n Presiona 1");
			opcion = scan.nextInt();
		} while (opcion == 1);
	}
}
