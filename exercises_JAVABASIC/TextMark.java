package ExerciseToPractice;

import java.util.Scanner;

public class TextMark {
	static Scanner scan = new Scanner(System.in);
	private static int numero;
	private static int opcion;
	private static int loop;

	public static void UsignIf(int numero) {
		if (numero == 9 || numero == 10) {
			System.out.println("Sobresaliente");
		} else if (numero == 7 || numero == 8) {
			System.out.println("Notable");
		} else if (numero == 6) {
			System.out.println("Bien");
		} else if (numero == 5) {
			System.out.println("Aprobado");
		} else if (numero == 0 || numero == 1 || numero == 2 || numero == 3 || numero == 4) {
			System.out.println("Suspenso");
		}
	}

	public static void UsignSwitch(int numero) {

		do {
			switch (numero) {
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 5:
				System.out.println("Aprobado");
				break;
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Suspenso");
				break;
			default:
				System.out.println("Ingresa un numero valudo");
				break;
			}

			System.out.println("Deseas evaluar otro numero? \n Presiona 1 para hacerlo");

		} while (opcion == 1);
	}

	public static void main(String[] args) {
		System.out.print("Ingresa el numero a evaluar: ");
		numero = scan.nextInt();

		System.out.println("Quieres usar un if(0) o un switch(1) para evaluar?");
		loop = scan.nextInt();
		
		if (loop == 0) {
			UsignIf(numero);
		} else {
			UsignSwitch(numero);
		}
	}
}
