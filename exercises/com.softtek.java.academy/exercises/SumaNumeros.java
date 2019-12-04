package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class SumaNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.print("Ingresa el numero a: ");
			int numA = scanner.nextInt();
			System.out.println("");
			System.out.print("Ingresa el numero b: ");
			int numB = scanner.nextInt();
			int suma = numA+numB;
			System.out.print("la suma de "+numA+ " + "+numB+" es "+suma +"\n");
			System.out.print("Ingresa 0 si quieres seguir");
			opcion = scanner.nextInt();
		} while (opcion == 0);
	}
}
