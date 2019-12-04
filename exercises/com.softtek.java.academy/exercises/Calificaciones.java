package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class Calificaciones {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		System.out.println("Ingresa tu calificacion");
		int calificacion = scanner.nextInt();

		switch (calificacion) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;

		case 5:
			System.out.println("Aprobado");
			break;

		case 6:
			System.out.println("Bien");
			break;

		case 7:
		case 8:
			System.out.println("Notable");
			break;

		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;

		default:
			System.out.println("No es una calificacion valida");

		}
	}
}
